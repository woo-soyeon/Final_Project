package com.example.saycheeze;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.w3c.dom.Text;

import java.security.acl.LastOwnerException;

public class Watermark_Fragment extends Fragment {

    ImageView view1;
    ImageView view2;

    private OnTimePointSetListener onTimePointSetListener;

    public interface OnTimePointSetListener {
        void OnTimePointSet(int[] imageViewLocation );
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof  OnTimePointSetListener) {
            onTimePointSetListener = (OnTimePointSetListener) context;
        }else {
            throw new RuntimeException(context.toString()+"asdfadfasf");
        }
    }

    @Override
    public void onDetach(){
        super.onDetach();
        onTimePointSetListener = null;
    }

    public Watermark_Fragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_watermark, container, false);

        view2 = ((MainActivity)getActivity()).findViewById(R.id.imageView_activity);

        ImageButton buttonNone = (ImageButton)view.findViewById(R.id.imageButtonNone);
        buttonNone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                view2.setImageResource(R.drawable.background_none);
            }
        });

        ImageButton button1 = (ImageButton)view.findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark1w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 658;
                imageViewLocation[1] += 350;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example1);

                //getActivity().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();

                //WindowManager.LayoutParams params = getActivity().builder.getWindow().getAttributes();
                //params.width = 200;
                //params.height = 200;
                //getActivity().builder.getWindow().sestAttributes(params);


            }
        });

        ImageButton button2 = (ImageButton)view.findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark2w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 974;
                imageViewLocation[1] += 374;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                //iv.setImageResource(R.drawable.example2);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button3 = (ImageButton)view.findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark3w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 976;
                imageViewLocation[1] += 276;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example3);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button4 = (ImageButton)view.findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark4w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 988;
                imageViewLocation[1] += 240;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example4);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button5 = (ImageButton)view.findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark5w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 688;
                imageViewLocation[1] += 326;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example5);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button6 = (ImageButton)view.findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark6w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 974;
                imageViewLocation[1] += 202;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                //iv.setImageResource(R.drawable.example6);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button7 = (ImageButton)view.findViewById(R.id.imageButton7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark7w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 691;
                imageViewLocation[1] += 326;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example7);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button8 = (ImageButton)view.findViewById(R.id.imageButton8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark8w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 1041;
                imageViewLocation[1] += 340;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example8);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button9 = (ImageButton)view.findViewById(R.id.imageButton9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark9w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 1468;
                imageViewLocation[1] += 355;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example9);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button10 = (ImageButton)view.findViewById(R.id.imageButton10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark10w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 710;
                imageViewLocation[1] += 616;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example10);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button11 = (ImageButton)view.findViewById(R.id.imageButton11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark11w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 713;
                imageViewLocation[1] += 273;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example11);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button12 = (ImageButton)view.findViewById(R.id.imageButton12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark12w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 984;
                imageViewLocation[1] += 292;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example12);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button13 = (ImageButton)view.findViewById(R.id.imageButton13);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark13w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 924;
                imageViewLocation[1] += 278;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example13);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button14 = (ImageButton)view.findViewById(R.id.imageButton14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark14w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 9930;
                imageViewLocation[1] += 384;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example14);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button15 = (ImageButton)view.findViewById(R.id.imageButton15);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark15w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 676;
                imageViewLocation[1] += 532;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example15);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button16 = (ImageButton)view.findViewById(R.id.imageButton16);
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark16w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 943;
                imageViewLocation[1] += 307;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example16);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button17 = (ImageButton)view.findViewById(R.id.imageButton17);
        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark17w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 970;
                imageViewLocation[1] += 465;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example17);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        ImageButton button18 = (ImageButton)view.findViewById(R.id.imageButton18);
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int[] imageViewLocation = new int[2];

                view2.setImageResource(R.drawable.mark18w);

                view2.getLocationOnScreen(imageViewLocation);

                imageViewLocation[0] -= 158;
                imageViewLocation[0] += 1274;
                imageViewLocation[1] += 420;

                onTimePointSetListener.OnTimePointSet(imageViewLocation);

                Log.d("X & Y", imageViewLocation[0]+ " & " +imageViewLocation[1]);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_image, null);
                ImageView iv = (ImageView)view.findViewById(R.id.iv);
                iv.setImageResource(R.drawable.example18);
                builder.setView(view);

                /*builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();;
                    }
                });*/

                builder.show();
            }
        });

        Button back = (Button)view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Main_Fragment fragment = new Main_Fragment();
                transaction.replace(R.id.fragment, fragment);
                transaction.commit();
            }
        });

        return view;
    }
}