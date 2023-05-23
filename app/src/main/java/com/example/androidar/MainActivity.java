package com.example.androidar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.ar.core.Anchor;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.Camera;
import com.google.ar.sceneform.Node;
import com.google.ar.sceneform.Sun;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity {

    private ArFragment arFragment;
    private Button button,button2;


    private int clickNo = 0;
    private int list=R.raw.aletter;
    public int a,b,c,d,e,f=0;





    public static boolean checkSystem(Activity activity) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            String openGlVersion = ((ActivityManager) Objects.requireNonNull(activity.getSystemService(Context.ACTIVITY_SERVICE))).getDeviceConfigurationInfo().getGlEsVersion();

            if (Double.parseDouble(openGlVersion) >= 3.0) {
                return true;
            } else {
                Toast.makeText(activity, "App needs OpenGl Version 3.0 or later", Toast.LENGTH_SHORT).show();
                activity.finish();
                return false;
            }
        } else {
            Toast.makeText(activity, "App does not support required Build Version", Toast.LENGTH_SHORT).show();
            activity.finish();
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        MediaPlayer.create(this, R.raw.hello).start();
        //A буква
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundPlayer(0);
                int id=0;
                list=R.raw.aletter;
                arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
                Objects.requireNonNull(arFragment).setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
                    clickNo++;
                    if (id==0 && a==0) {
                        Anchor anchor = hitResult.createAnchor();
                        ModelRenderable.builder()
                                .setSource(arFragment.getContext(), list)
                                .setIsFilamentGltf(true)
                                .build()
                                .thenAccept(modelRenderable -> add(anchor, modelRenderable))
                                .exceptionally(throwable -> {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(arFragment.getContext());
                                    builder.setMessage("Somthing is not right" + throwable.getMessage()).show();
                                    return null;
                                });
                        a+=1;


                    }
                });


            }
        });

//B буква
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundPlayer(1);
                int id=1;
                list=R.raw.bletter;
                arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
                Objects.requireNonNull(arFragment).setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
                    clickNo++;
                    if (id==1 && b==0) {
                        Anchor anchor = hitResult.createAnchor();
                        ModelRenderable.builder()
                                .setSource(arFragment.getContext(), list)
                                .setIsFilamentGltf(true)
                                .build()
                                .thenAccept(modelRenderable -> add(anchor, modelRenderable))
                                .exceptionally(throwable -> {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(arFragment.getContext());
                                    builder.setMessage("Somthing is not right" + throwable.getMessage()).show();
                                    return null;
                                });
                        b+=1;
                    }
                });


            }
        });
    }
    //C буква


        public void letterc(View view) {
            SoundPlayer(2);
            int id=2;
            list=R.raw.cletter;
            arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
            Objects.requireNonNull(arFragment).setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
                clickNo++;
                if (id==2 && c==0) {
                    Anchor anchor = hitResult.createAnchor();
                    ModelRenderable.builder()
                            .setSource(arFragment.getContext(), list)
                            .setIsFilamentGltf(true)
                            .build()
                            .thenAccept(modelRenderable -> add(anchor, modelRenderable))
                            .exceptionally(throwable -> {
                                AlertDialog.Builder builder = new AlertDialog.Builder(arFragment.getContext());
                                builder.setMessage("Somthing is not right" + throwable.getMessage()).show();
                                return null;
                            });
                    c+=1;
                }
            });


        }
    //D буква


    public void letterd(View view) {
        SoundPlayer(3);
        int id=3;
        list=R.raw.dletter;
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        Objects.requireNonNull(arFragment).setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
            clickNo++;
            if (id==3 && d==0) {
                Anchor anchor = hitResult.createAnchor();
                ModelRenderable.builder()
                        .setSource(arFragment.getContext(), list)
                        .setIsFilamentGltf(true)
                        .build()
                        .thenAccept(modelRenderable -> add(anchor, modelRenderable))
                        .exceptionally(throwable -> {
                            AlertDialog.Builder builder = new AlertDialog.Builder(arFragment.getContext());
                            builder.setMessage("Somthing is not right" + throwable.getMessage()).show();
                            return null;
                        });
                d+=1;
            }
        });
    }
    //E буква


    public void lettere(View view) {
        SoundPlayer(4);
        int id=4;
        list=R.raw.eletter;
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        Objects.requireNonNull(arFragment).setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
            clickNo++;
            if (id==4 && e==0) {
                Anchor anchor = hitResult.createAnchor();
                ModelRenderable.builder()
                        .setSource(arFragment.getContext(), list)
                        .setIsFilamentGltf(true)
                        .build()
                        .thenAccept(modelRenderable -> add(anchor, modelRenderable))
                        .exceptionally(throwable -> {
                            AlertDialog.Builder builder = new AlertDialog.Builder(arFragment.getContext());
                            builder.setMessage("Somthing is not right" + throwable.getMessage()).show();
                            return null;
                        });
                e+=1;
            }
        });
    }
    //F буква


    public void letterf(View view) {
        SoundPlayer(5);
        int id=5;
        list=R.raw.fletter;
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        Objects.requireNonNull(arFragment).setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
            clickNo++;
            if (id==5 && f==0) {
                Anchor anchor = hitResult.createAnchor();
                ModelRenderable.builder()
                        .setSource(arFragment.getContext(), list)
                        .setIsFilamentGltf(true)
                        .build()
                        .thenAccept(modelRenderable -> add(anchor, modelRenderable))
                        .exceptionally(throwable -> {
                            AlertDialog.Builder builder = new AlertDialog.Builder(arFragment.getContext());
                            builder.setMessage("Somthing is not right" + throwable.getMessage()).show();
                            return null;
                        });
                f+=1;
            }
        });
    }
    //Возврат на предыдущий активити
    public void back_to_menu(View view){
        Intent i = new Intent(this, LetterMenu.class);
        startActivity(i);
    }



    private void SoundPlayer(int i) {
        if(i==0) {
            MediaPlayer.create(this, R.raw.musica).start();
        }
        if(i==1){
            MediaPlayer.create(this, R.raw.musicb).start();
        }
        if(i==2){
            MediaPlayer.create(this, R.raw.musicc).start();
        }
        if(i==3){
            MediaPlayer.create(this, R.raw.musicd).start();
        }
        if(i==4){
            MediaPlayer.create(this, R.raw.musice).start();
        }
        if(i==5){
            MediaPlayer.create(this, R.raw.musicf).start();
        }

    }

    private void add(Anchor anchor, ModelRenderable modelRenderable) {

        AnchorNode anchorNode = new AnchorNode(anchor);
        anchorNode.setParent(arFragment.getArSceneView().getScene());
        TransformableNode model = new TransformableNode(arFragment.getTransformationSystem());
        model.setParent(anchorNode);
        model.setRenderable(modelRenderable);
        model.select();
    }

}