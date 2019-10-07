/*
Created by:  Brian Bui
Due:  6 October 2019
CPSC411 HW-1

 */

package com.example.brianbui_411_hw1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup.LayoutParams LP = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        //  handle the initial grid
        GridLayout gView = new GridLayout(this);
        gView.setOrientation(GridLayout.VERTICAL);
        gView.setLayoutParams(LP);
        gView.setColumnCount(5);
        gView.setRowCount(11);

        //  column widths
        int microUnit = 50;
        int standardUnit = 300;
        //  micro 6
        //  micro 1 2 3
        int titleUnit = standardUnit * 6;

        //  Micro
        for (int i = 1; i<12; i++){
            TextView x = new TextView(this);
            x.setTextColor(Color.BLACK);
            x.setText(java.lang.Integer.toString(i));
            x.setBackgroundColor(Color.GRAY);                      //  grey0xD4D0C8
            x.setMinWidth(microUnit);
            x.setGravity(Gravity.CENTER);
            gView.addView(x);
        }

        //  Title
        GridLayout.LayoutParams gParam = new GridLayout.LayoutParams(
                GridLayout.spec(0),
                GridLayout.spec(1,4)
        );
        TextView title = new TextView(this);
        title.setText("Rules void hello1(int hour)");
        title.setBackgroundColor(Color.BLACK);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setMinWidth(titleUnit);
        title.setLayoutParams(gParam);
        gView.addView(title);

        //  Col 2
        GridLayout col2 = new GridLayout(this);
        col2.setOrientation(GridLayout.VERTICAL);

        gParam = new GridLayout.LayoutParams(
                GridLayout.spec(1, 2, ViewGroup.LayoutParams.MATCH_PARENT),
                GridLayout.spec(1)
        );
        TextView col2Text = new TextView(this);
        col2Text.setTextColor(Color.BLACK);
        col2Text.setText("properties");
        col2Text.setGravity(Gravity.CENTER);
            col2Text.setBackground(getDrawable(R.drawable.thiccborder));
        col2Text.setMinWidth(standardUnit);
        col2Text.setMinHeight(100);
        col2Text.setLayoutParams(gParam);
        gView.addView(col2Text);

        col2Text = new TextView(this);
        col2Text.setText("Rule");
        col2Text.setGravity(Gravity.CENTER);
        col2Text.setBackground(getDrawable(R.drawable.row456));
        col2Text.setMinWidth(standardUnit);
        col2Text.setTypeface(null, Typeface.BOLD);
        gView.addView(col2Text);

        for (int i = 0; i<2; i++){
            col2Text = new TextView(this);
            col2Text.setBackground(getDrawable(R.drawable.row456));
            col2Text.setMinWidth(standardUnit);
            gView.addView(col2Text);
        }

        col2Text = new TextView(this);
        col2Text.setTextColor(Color.BLACK);
        col2Text.setText("Rule");
        col2Text.setPadding(10, 0, 0, 0);
        col2Text.setBackground(getDrawable(R.drawable.thiccborder));
        col2Text.setMinWidth(standardUnit);
        col2Text.setTypeface(null, Typeface.BOLD);
        gView.addView(col2Text);

        for (int i = 10; i<50; i+=10){
            col2Text = new TextView(this);
            col2Text.setTextColor(Color.BLACK);
            col2Text.setText("R" + i);
            col2Text.setPadding(10, 0, 0, 0);
            col2Text.setBackground(getDrawable(R.drawable.thiccborder));
            col2Text.setMinWidth(standardUnit);
            gView.addView(col2Text);
        }

        //  Col 3
        gParam = new GridLayout.LayoutParams(
                GridLayout.spec(1),
                GridLayout.spec(2, 2)
        );
        TextView col3Text = new TextView(this);
        col3Text.setTextColor(Color.BLACK);
        col3Text.setText("name");
        col3Text.setGravity(Gravity.CENTER);
        col3Text.setMinWidth(2 * standardUnit);
        col3Text.setBackground(getDrawable(R.drawable.thiccborder));
        col3Text.setLayoutParams(gParam);
        gView.addView(col3Text);

        gParam = new GridLayout.LayoutParams(
                GridLayout.spec(2),
                GridLayout.spec(2, 2)
        );
        col3Text = new TextView(this);
        col3Text.setTextColor(Color.BLACK);
        col3Text.setText("category");
        col3Text.setGravity(Gravity.CENTER);
        col3Text.setMinWidth(2 * standardUnit);
        col3Text.setBackground(getDrawable(R.drawable.thiccborder));
        col3Text.setLayoutParams(gParam);
        gView.addView(col3Text);

        gParam = new GridLayout.LayoutParams(
                GridLayout.spec(3),
                GridLayout.spec(2, 2)
        );
        col3Text = new TextView(this);
        col3Text.setTextColor(Color.BLACK);
        col3Text.setText("C1");
        col3Text.setGravity(Gravity.CENTER);
        col3Text.setMinWidth(2 * standardUnit);
        col3Text.setBackground(getDrawable(R.drawable.row456));
        col3Text.setLayoutParams(gParam);
        col3Text.setTypeface(null, Typeface.BOLD);
        gView.addView(col3Text);

        gParam = new GridLayout.LayoutParams(
                GridLayout.spec(4),
                GridLayout.spec(2, 2)
        );
        col3Text = new TextView(this);
        col3Text.setTextColor(Color.BLACK);
        col3Text.setText("min <= hour && hour <= max");
        col3Text.setGravity(Gravity.CENTER);
        col3Text.setMinWidth(2 * standardUnit);
        col3Text.setBackground(getDrawable(R.drawable.row456));
        col3Text.setLayoutParams(gParam);
        gView.addView(col3Text);

        //  left
        gParam = new GridLayout.LayoutParams(
                GridLayout.spec(5),
                GridLayout.spec(2, 1)
        );
        col3Text = new TextView(this);
        col3Text.setTextColor(Color.BLACK);
        col3Text.setText("int min");
        col3Text.setGravity(Gravity.CENTER);
        col3Text.setMinWidth(standardUnit);
        col3Text.setBackground(getDrawable(R.drawable.row456));
        col3Text.setLayoutParams(gParam);
        gView.addView(col3Text);

        col3Text = new TextView(this);
        col3Text.setTextColor(Color.BLACK);
        col3Text.setText(" From");
        col3Text.setPadding(10, 0, 0, 0);
        col3Text.setMinWidth(standardUnit);
        col3Text.setBackground(getDrawable(R.drawable.thiccyellow));
        col3Text.setTypeface(null, Typeface.BOLD);
        gView.addView(col3Text);

        String[] nums = {"0", "12", "18", "22"};
        for (int i = 0; i<4; i++){
            col3Text = new TextView(this);
            col3Text.setTextColor(Color.BLACK);
            col3Text.setText(nums[i]);
            col3Text.setGravity(Gravity.RIGHT);
            col3Text.setPadding(0,0,10,0);
            col3Text.setMinWidth(standardUnit);
            col3Text.setBackground(getDrawable(R.drawable.thiccyellow));
            gView.addView(col3Text);
        }

        //  right
        gParam = new GridLayout.LayoutParams(
                GridLayout.spec(5),
                GridLayout.spec(3)
        );
        TextView col4Text = new TextView(this);
        col4Text.setTextColor(Color.BLACK);
        col4Text.setText("int max");
        col4Text.setGravity(Gravity.CENTER);
        col4Text.setMinWidth(standardUnit);
        col4Text.setBackground(getDrawable(R.drawable.row456));
        col4Text.setLayoutParams(gParam);
        gView.addView(col4Text);

        col4Text = new TextView(this);
        col4Text.setTextColor(Color.BLACK);
        col4Text.setText(" From");
        col4Text.setPadding(10, 0, 0, 0);
        col4Text.setMinWidth(standardUnit);
        col4Text.setBackground(getDrawable(R.drawable.thiccyellow));
        col4Text.setTypeface(null, Typeface.BOLD);
        gView.addView(col4Text);

        String[] nums2 = {"11", "17", "21", "23"};
        for (int i = 0; i<4; i++){
            col4Text = new TextView(this);
            col4Text.setTextColor(Color.BLACK);
            col4Text.setText(nums2[i]);
            col4Text.setGravity(Gravity.RIGHT);
            col4Text.setPadding(0,0,10,0);
            col4Text.setMinWidth(standardUnit);
            col4Text.setBackground(getDrawable(R.drawable.thiccyellow));
            gView.addView(col4Text);
        }

        //  LAST ONE LET'S DO THIS
        TextView col5Text = new TextView(this);
        col5Text.setTextColor(Color.BLACK);
        col5Text.setText("Day Hour Classification");
        col5Text.setBackground(getDrawable(R.drawable.thiccborder));
        col5Text.setPadding(10, 0, 0, 0);
        col5Text.setMinWidth(3*standardUnit);
        gView.addView(col5Text);

        col5Text = new TextView(this);
        col5Text.setTextColor(Color.BLACK);
        col5Text.setText("Day and Time");
        col5Text.setBackground(getDrawable(R.drawable.thiccborder));
        col5Text.setPadding(10, 0, 0, 0);
        col5Text.setMinWidth(3*standardUnit);
        gView.addView(col5Text);

        col5Text = new TextView(this);
        col5Text.setTextColor(Color.BLACK);
        col5Text.setText("A1");
        col5Text.setBackground(getDrawable(R.drawable.row456));
        col5Text.setGravity(Gravity.CENTER);
        col5Text.setTypeface(null, Typeface.BOLD);
        col5Text.setMinWidth(3*standardUnit);
        gView.addView(col5Text);

        col5Text = new TextView(this);
        col5Text.setTextColor(Color.BLACK);
        col5Text.setText("System.out.println(greeting + \",World!\")");
        col5Text.setBackground(getDrawable(R.drawable.row456));
        col5Text.setGravity(Gravity.CENTER);
        col5Text.setMinWidth(3*standardUnit);
        gView.addView(col5Text);

        col5Text = new TextView(this);
        col5Text.setTextColor(Color.BLACK);
        col5Text.setText("String greeting");
        col5Text.setBackground(getDrawable(R.drawable.row456));
        col5Text.setGravity(Gravity.CENTER);
        col5Text.setMinWidth(3*standardUnit);
        gView.addView(col5Text);

        col5Text = new TextView(this);
        col5Text.setTextColor(Color.BLACK);
        col5Text.setText("Greeting");
        col5Text.setBackground(getDrawable(R.drawable.thiccorange));
        col5Text.setTypeface(null, Typeface.BOLD);
        col5Text.setPadding(10,0,0,0);
        col5Text.setMinWidth(3*standardUnit);
        gView.addView(col5Text);

        String[] lastCorner = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
        for (String x : lastCorner){
            col5Text = new TextView(this);
            col5Text.setTextColor(Color.BLACK);
            col5Text.setText(x);
            col5Text.setBackground(getDrawable(R.drawable.thiccorange));
            col5Text.setPadding(10,0,0,0);
            col5Text.setMinWidth(3*standardUnit);
            gView.addView(col5Text);
        }

        //  Content view

        setContentView(gView);
        //  setContentView(R.layout.activity_main);

        /*  HorizontalScrollView HSV = new HorizontalScrollView(this);
        HSV.addView(gView);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        CRASHES MY EMULATOR FOR SOME REASON?
         */
    }
}
