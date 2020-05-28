package com.example.alaborg;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ProfileActivity extends Activity
{
    private static final int CAMERA_REQUEST = 1888;
    private ImageView imageView;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;
    public static final String MY_PREFS_NAME = "ProfileInformation";
    private static int PICK_CONTACT = 0;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Log.i("ProfileActivity", "onCreate activated!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        final SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.apply();
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);

        this.imageView = this.findViewById(R.id.imageView_profile_pic);
        Button photoButton = this.findViewById(R.id.btn_change_pic);
        Button btnSave = findViewById(R.id.btn_save);
        Button btnBestFriend = findViewById(R.id.btn_friend);

        final EditText etfname = findViewById(R.id.editText_fname);
        final EditText etlname = findViewById(R.id.editText_lname);
        final EditText etemail = findViewById(R.id.editText_email);
        final TextView bff = findViewById(R.id.tvBestFriend);
        etfname.setText(prefs.getString("firstname", "Fornavn"));
        etlname.setText(prefs.getString("lastname", "Eftirnavn"));
        etemail.setText(prefs.getString("email", "Teldupostur"));
        bff.setText(prefs.getString("bestfriend", "Besti vinur"));

        photoButton.setOnClickListener(new View.OnClickListener()
                {
            @Override
            public void onClick(View v)
            {
                if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
                {
                    requestPermissions(new String[]{Manifest.permission.CAMERA}, MY_CAMERA_PERMISSION_CODE);
                }
                else
                {
                    Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(cameraIntent, CAMERA_REQUEST);
                }
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editor.putString("firstname", etfname.getText().toString());
                editor.putString("lastname", etlname.getText().toString());
                editor.putString("email", etemail.getText().toString());
                editor.putString("bestfriend", bff.getText().toString());
                editor.apply();
                Log.i("ProfileActivity", "First name " + etfname.getText().toString() + " saved to SharedPreferences.");
                Log.i("ProfileActivity", "Last name " + etlname.getText().toString() + " saved to SharedPreferences.");
                Log.i("ProfileActivity", "E-mail Address " + etemail.getText().toString() + " saved to SharedPreferences.");
                Log.i("ProfileActivity", "Bestfriend: " + bff.getText().toString() + " saved to SharedPreferences.");
                startActivity(new Intent(ProfileActivity.this, MainActivity.class));
                Log.i("ProfileActivity", "Save button clicked!");
            }
        });

        btnBestFriend.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent, PICK_CONTACT);
                Log.i("ProfileActivity", "Search button clicked!");
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == MY_CAMERA_PERMISSION_CODE)
        {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Log.i("Information", "Camera permission granted!");
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
            else
            {
                Log.i("Information", "Camera permission denied!");
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK)
        {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }

        if (requestCode == PICK_CONTACT) {
            if (resultCode == RESULT_OK) {
                Uri contactUri = data.getData();
                Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
                cursor.moveToFirst();
                int column = cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
                String name = cursor.getString(column);
                TextView display = findViewById(R.id.tvBestFriend);
                display.setText(name);
            }
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("ProfileActivity", "OnStart activated!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("ProfileActivity", "onResume activated!");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("ProfileActivity", "onPause activated!");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("ProfileActivity", "onStop activated!");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("ProfileActivity", "onDestroy activated!");

    }
}