package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;
    CheckBox cb_mouth,cb_arms,cb_ears,cb_hat,cb_eyebrow,cb_glasses,cb_eye,cb_mustache,cb_nose,cb_shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
    }
    public void cbMouth(View view){
        mouth=findViewById(R.id.mouth);
        cb_mouth=findViewById(R.id.cb_mouth);
        if(cb_mouth.isChecked()){
            mouth.setVisibility(View.VISIBLE);
        }
        else{
            mouth.setVisibility(View.GONE);
        }
    }
    public void cbArms(View view){
        arms=findViewById(R.id.arms);
        cb_arms=findViewById(R.id.cb_arms);
        if(cb_arms.isChecked()){
            arms.setVisibility(View.VISIBLE);
        }
        else{
            arms.setVisibility(View.GONE);
        }
    }
    public void cbEars(View view){
        ears=findViewById(R.id.ears);
        cb_ears=findViewById(R.id.cb_ears);
        if(cb_ears.isChecked()){
            ears.setVisibility(View.VISIBLE);
        }
        else{
            ears.setVisibility(View.GONE);
        }
    }
    public void cbHat(View view){
        hat=findViewById(R.id.hat);
        cb_hat=findViewById(R.id.cb_hat);
        if(cb_hat.isChecked()){
            hat.setVisibility(View.VISIBLE);
        }
        else{
            hat.setVisibility(View.GONE);
        }
    }
    public void cbEyebrow(View view){
        eyebrows=findViewById(R.id.eyebrows);
        cb_eyebrow=findViewById(R.id.cb_eyebrow);
        if(cb_eyebrow.isChecked()){
            eyebrows.setVisibility(View.VISIBLE);
        }
        else{
            eyebrows.setVisibility(View.GONE);
        }
    }
    public void cbGlasses(View view){
        glasses=findViewById(R.id.glasses);
        cb_glasses=findViewById(R.id.cb_glasses);
        if(cb_glasses.isChecked()){
            glasses.setVisibility(View.VISIBLE);
        }
        else{
            glasses.setVisibility(View.GONE);
        }
    }
    public void cbEye(View view){
        eyes=findViewById(R.id.eyes);
        cb_eye=findViewById(R.id.cb_eye);
        if(cb_eye.isChecked()){
            eyes.setVisibility(View.VISIBLE);
        }
        else{
            eyes.setVisibility(View.GONE);
        }
    }
    public void cbMustache(View view){
        mustache=findViewById(R.id.mustache);
        cb_mustache=findViewById(R.id.cb_mustache);
        if(cb_mustache.isChecked()){
            mustache.setVisibility(View.VISIBLE);
        }
        else{
            mustache.setVisibility(View.GONE);
        }
    }
    public void cbNose(View view){
        nose=findViewById(R.id.nose);
        cb_nose=findViewById(R.id.cb_nose);
        if(cb_nose.isChecked()){
            nose.setVisibility(View.VISIBLE);
        }
        else{
            nose.setVisibility(View.GONE);
        }
    }
    public void cbShoes(View view){
        shoes=findViewById(R.id.shoes);
        cb_shoes=findViewById(R.id.cb_shoes);
        if(cb_shoes.isChecked()){
            shoes.setVisibility(View.VISIBLE);
        }
        else{
            shoes.setVisibility(View.GONE);
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // 检测屏幕的方向：纵向或横向
        if (this.getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {
            //当前为横屏， 在此处添加额外的处理代码
            Toast.makeText(this,"现在是横屏",Toast.LENGTH_LONG).show();

        } else if (this.getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_PORTRAIT) {
            //当前为竖屏， 在此处添加额外的处理代码
            Toast.makeText(this,"现在是竖屏",Toast.LENGTH_LONG).show();
        }
    }
}
