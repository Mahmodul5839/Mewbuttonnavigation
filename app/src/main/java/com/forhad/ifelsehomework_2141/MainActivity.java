package com.forhad.ifelsehomework_2141;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import soup.neumorphism.NeumorphButton;

public class MainActivity extends AppCompatActivity {
    private static final String[]Subject = new String[]{
          "Mathematics-1","Computer application","Physics-1","Electrical engineering","English","Physical education ","Bangla" ,"Database Application","Mathematics-2","IT support System-1","Physics-2","Graphics Design-1","Communicative English","Analog Electronics",
            "Programing Essentials","Mathematics-3","Web Design","Chemistry","Graphics design-||","Social Science","IT support System-||","Object-Oriented Programing","Web Development","Data Sturacture & Algorithm","Computer Peripherals","Data Communication System","Businesss Organization & communication","The principle of Digital Electronics","Programing in Java","Surveillance Security System","Web Development Project","Operating Systems application","PcB Design and Circuit Making","Accounting Theory & Practice",
            " Sequential Logic System","Web Mastering","Data Base Management System","Environmental Studies,"
    };


    EditText eddivide,edleapyear,edweekday,ednum1,ednum2,ednum3,ednum4,ednum5,ednum6,ednum7,edsub1,edsub2;
    EditText edunit;
    TextView tvdisplay1,tvdisplay2,tvdisplay3,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
    Button total,total1,total2;
    MeowBottomNavigation bottomNavigation;
    NeumorphButton clickhere,recat,currant;
    LinearLayout linear;
    RelativeLayout visiif,visigpa,visieli;

    double gpa ;
    double avarage,last,totall;

    AutoCompleteTextView editText,editText1,editText2,editText3,editText4,editText5,editText6,editText7;


    String dfk,name1,name2,name3,name4,name5,name6,name7;
    String TV2,TV3,TV4,TV5,TV6,TV7;
    String subj1,subj2,subj3,subj4,subj5,subj6,subj7;
    String  unit;
    Double elictricity;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        edunit = findViewById(R.id.edunit);
        currant = findViewById(R.id.currant);
        tv10 = findViewById(R.id.tv10);





        currant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unit = edunit.getText().toString();
                elictricity = Double.parseDouble(unit);
                if (elictricity>0 && elictricity<=50 ){
                    totall = elictricity*0.50;
                    last = totall;
                    tv10.setText("মোট কারেন্ট বিল =" +last);

                }
                else if(elictricity>50 && elictricity<=100){
                    totall = elictricity*0.75;
                    last = totall;
                    tv10.setText(""+last);
                }
                else if(elictricity>100 && elictricity<=250){
                    totall = elictricity*0.80;
                    last = totall;
                    tv10.setText("মোট কারেন্ট বিল = " +last);
                }else {
                    totall = elictricity*1.50;
                    last = totall;
                    tv10.setText("মোট কারেন্ট বিল =" +last);
                }

            }
        });









        visigpa = findViewById(R.id.visigpa);
        visiif = findViewById(R.id.visiif);
        visieli = findViewById(R.id.visieli);




        recat = findViewById(R.id.recat);

        editText = findViewById(R.id.edsub1);
        editText1 = findViewById(R.id.edsub2);
        editText2 = findViewById(R.id.edsub3);
        editText3=  findViewById(R.id.edsub4);
        editText4 = findViewById(R.id.edsub4);
        editText5 = findViewById(R.id.edsub5);
        editText6 = findViewById(R.id.edsub6);
        editText7 = findViewById(R.id.edsub7);
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Subject);
        editText.setAdapter(adapter);
        editText1.setAdapter(adapter);
        editText2.setAdapter(adapter);
        editText3.setAdapter(adapter);
        editText4.setAdapter(adapter);
        editText5.setAdapter(adapter);
        editText6.setAdapter(adapter);
        editText7.setAdapter(adapter);


        ednum1 = findViewById(R.id.ednum1);
        ednum2 = findViewById(R.id.ednum2);
        ednum3 = findViewById(R.id.ednum3);
        ednum4 = findViewById(R.id.ednum4);
        ednum5 = findViewById(R.id.ednum5);
        ednum6 = findViewById(R.id.ednum6);
        ednum7 = findViewById(R.id.ednum7);



        edsub1 = findViewById(R.id.edsub1);
        edsub2 = findViewById(R.id.edsub2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);

        linear  = findViewById(R.id.linear);
        clickhere = findViewById(R.id.clickhere);
        clickhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Snum1= ednum1.getText().toString();
                String Snum2 = ednum2.getText().toString();
                String Snum3= ednum3.getText().toString();
                String Snum4 = ednum4.getText().toString();
                String Snum5= ednum5.getText().toString();
                String Snum6 = ednum6.getText().toString();
                String Snum7= ednum7.getText().toString();

                String Ssub1 = editText.getText().toString();
                String Ssub2 = editText1.getText().toString();
                String Ssub3 = editText2.getText().toString();
                String Ssub4 = editText3.getText().toString();
                String Ssub5 = editText4.getText().toString();
                String Ssub6 = editText5.getText().toString();
                String Ssub7 = editText7.getText().toString();



                if (Ssub1.length()==0){
                    editText.setError("Please enter the number");
                }
                else if (Ssub2.length()==0){
                    editText1.setError("Plese enter  the number");

                }

                else if (Ssub3.length()==0){
                    editText2.setError("Plese enter  the number");

                }
                else if (Ssub4.length()==0){
                    editText3.setError("Plese enter  the number");

                }
                else if (Ssub5.length()==0){
                    editText4.setError("Plese enter  the number");

                }
                else if (Ssub6.length()==0){
                    editText5.setError("Plese enter  the number");

                }
                else if (Ssub7.length()==0){
                    editText7.setError("Plese enter  the number");

                }


                else if(Snum1.length()==0){
                    ednum1.setError("Please enter the number");
                }
                else if(Snum2.length()==0){
                    ednum2.setError("Please enter the number");
                }
                else if(Snum3.length()==0){
                    ednum3.setError("Please enter the number");
                }

                else if(Snum4.length()==0){
                    ednum4.setError("Please enter the number");
                }

                else if(Snum5.length()==0){
                    ednum5.setError("Please enter the number");
                }
                else if(Snum6.length()==0){
                    ednum6.setError("Please enter the number");
                }
                else if(Snum7.length()==0){
                    ednum7.setError("Please enter the number");

                }else {
                    int num1 = Integer.parseInt(Snum1);
                    int num2 = Integer.parseInt(Snum2);
                    int num3 = Integer.parseInt(Snum3);
                    int num4 = Integer.parseInt(Snum4);
                    int num5 = Integer.parseInt(Snum5);
                    int num6 = Integer.parseInt(Snum6);
                    int num7 = Integer.parseInt(Snum7);




                    if(num1>=80 && num1<=100){
                        tv1.setText("A+");
                        gpa = gpa + 4.00;
                        avarage = avarage+num1;
                    }
                    else if (num1>=75 && num1<=79){
                        gpa = gpa + 3.75;
                        avarage = avarage+num1;
                        tv1.setText("A");

                    }
                    else if (num1>=70 && num1<=74){
                        tv1.setText("A-");
                        avarage = avarage+num1;
                        gpa = gpa +3.50;

                    }
                    else if (num1>=65&& num1<=69){
                        tv1.setText("B+");
                        avarage = avarage+num1;
                        gpa = gpa +3.25;

                    }
                    else if (num1>=60 && num1<=64){
                        tv1.setText("B");
                        avarage = avarage+num1;
                        gpa = gpa +3.00;

                    }
                    else if (num1>=55 && num1<=59){
                        tv1.setText("B-");
                        avarage = avarage+num1;
                        gpa = gpa +2.75;

                    }
                    else if (num1>=50 && num1<=54){
                        tv1.setText("C+");
                        avarage = avarage+num1;
                        gpa = gpa +2.50;

                    }
                    else if (num1>=45 && num1<=49){
                        tv1.setText("C");
                        avarage = avarage+num1;
                        gpa = gpa +2.25;

                    }
                    else if (num1>=40 && num1<=44){
                        tv1.setText("D");
                        avarage = avarage+num1;
                        gpa = gpa +2.00;

                    } else{
                        tv1.setText("F");
                        avarage = avarage+num1;
                        gpa = gpa +0.00;


                    }

                    if(num2>=80 && num2<=100){
                        tv2.setText("A+");
                        avarage = avarage+num2;
                        gpa = gpa + 4.00;
                    }
                    else if (num2>=75 && num2<=79){
                        gpa = gpa + 3.75;
                        avarage = avarage+num2;
                        tv2.setText("A");

                    }
                    else if (num2>=70 && num2<=74){
                        tv2.setText("A-");
                        avarage = avarage+num2;
                        gpa = gpa +3.50;

                    }
                    else if (num2>=65&& num2<=69){
                        tv2.setText("B+");
                        avarage = avarage+num2;
                        gpa = gpa +3.25;

                    }
                    else if (num2>=60 && num2<=64){
                        tv2.setText("B");
                        avarage = avarage+num2;
                        gpa = gpa +3.00;

                    }
                    else if (num2>=55 && num2<=59){
                        tv2.setText("B-");
                        avarage = avarage+num2;
                        gpa = gpa +2.75;

                    }
                    else if (num2>=50 && num2<=54){
                        tv2.setText("C+");
                        avarage = avarage+num2;
                        gpa = gpa +2.50;

                    }
                    else if (num2>=45 && num2<=49){
                        tv2.setText("C");
                        avarage = avarage+num2;
                        gpa = gpa +2.25;

                    }
                    else if (num2>=40 && num2<=44){
                        tv2.setText("D");
                        avarage = avarage+num2;
                        gpa = gpa +2.00;

                    } else{
                        tv2.setText("F");
                        avarage = avarage+num2;
                        gpa = gpa +0.00;


                    }

                    if(num3>=80 && num3<=100){
                        tv3.setText("A+");
                        avarage = avarage+num3;
                        gpa = gpa + 4.00;
                    }
                    else if (num3>=75 && num3<=79){
                        gpa = gpa + 3.75;
                        avarage = avarage+num3;
                        tv3.setText("A");

                    }
                    else if (num3>=70 && num3<=74){
                        tv3.setText("A-");
                        avarage = avarage+num3;
                        gpa = gpa +3.50;

                    }
                    else if (num3>=65&& num2<=69){
                        tv3.setText("B+");
                        avarage = avarage+num3;
                        gpa = gpa +3.25;

                    }
                    else if (num3>=60 && num3<=64){
                        tv3.setText("B");
                        avarage = avarage+num3;
                        gpa = gpa +3.00;

                    }
                    else if (num3>=55 && num3<=59){
                        tv3.setText("B-");
                        avarage = avarage+num3;
                        gpa = gpa +2.75;

                    }
                    else if (num3>=50 && num3<=54){
                        tv3.setText("C+");
                        avarage = avarage+num3;
                        gpa = gpa +2.50;

                    }
                    else if (num3>=45 && num3<=49){
                        tv3.setText("C");
                        avarage = avarage+num3;
                        gpa = gpa +2.25;

                    }
                    else if (num3>=40 && num3<=44){
                        tv3.setText("D");
                        avarage = avarage+num3;
                        gpa = gpa +2.00;

                    } else{
                        tv3.setText("F");
                        gpa = gpa +0.00;
                        avarage = avarage+num3;


                    }

                    if(num4>=80 && num4<=100){
                        tv4.setText("A+");
                        avarage = avarage+num4;
                        gpa = gpa + 4.00;
                    }
                    else if (num4>=75 && num4<=79){
                        gpa = gpa + 3.75;
                        avarage = avarage+num4;
                        tv4.setText("A");

                    }
                    else if (num4>=70 && num4<=74){
                        tv2.setText("A-");
                        avarage = avarage+num4;
                        gpa = gpa +3.50;

                    }
                    else if (num4>=65&& num4<=69){
                        tv4.setText("B+");
                        avarage = avarage+num4;
                        gpa = gpa +3.25;

                    }
                    else if (num4>=60 && num4<=64){
                        tv4.setText("B");
                        avarage = avarage+num4;
                        gpa = gpa +3.00;

                    }
                    else if (num4>=55 && num4<=59){
                        tv4.setText("B-");
                        avarage = avarage+num4;
                        gpa = gpa +2.75;

                    }
                    else if (num4>=50 && num4<=54){
                        tv4.setText("C+");
                        avarage = avarage+num4;
                        gpa = gpa +2.50;

                    }
                    else if (num4>=45 && num4<=49){
                        tv4.setText("C");
                        avarage = avarage+num4;
                        gpa = gpa +2.25;

                    }
                    else if (num4>=40 && num4<=44){
                        tv4.setText("D");
                        avarage = avarage+num4;
                        gpa = gpa +2.00;

                    } else{
                        tv4.setText("F");
                        avarage = avarage+num4;
                        gpa = gpa +0.00;


                    }


                    if(num5>=80 && num5<=100){
                        tv5.setText("A+");
                        avarage = avarage+num5;
                        gpa = gpa + 4.00;
                    }
                    else if (num5>=75 && num5<=79){
                        gpa = gpa + 3.75;
                        tv5.setText("A");
                        avarage = avarage+num5;

                    }
                    else if (num5>=70 && num5<=74){
                        tv5.setText("A-");
                        gpa = gpa +3.50;
                        avarage = avarage+num5;

                    }
                    else if (num5>=65&& num5<=69){
                        tv5.setText("B+");
                        gpa = gpa +3.25;
                        avarage = avarage+num5;

                    }
                    else if (num5>=60 && num5<=64){
                        tv5.setText("B");
                        gpa = gpa +3.00;
                        avarage = avarage+num5;

                    }
                    else if (num5>=55 && num5<=59){
                        tv5.setText("B-");
                        gpa = gpa +2.75;
                        avarage = avarage+num5;

                    }
                    else if (num5>=50 && num5<=54){
                        tv5.setText("C+");
                        gpa = gpa +2.50;
                        avarage = avarage+num5;

                    }
                    else if (num5>=45 && num5<=49){
                        tv5.setText("C");
                        gpa = gpa +2.25;
                        avarage = avarage+num5;

                    }
                    else if (num5>=40 && num5<=44){
                        tv5.setText("D");
                        gpa = gpa +2.00;
                        avarage = avarage+num5;

                    } else{
                        tv5.setText("F");
                        gpa = gpa +0.00;
                        avarage = avarage+num5;


                    }


                    if(num6>=80 && num6<=100){
                        tv6.setText("A+");
                        gpa = gpa + 4.00;
                        avarage = avarage+num6;
                    }
                    else if (num6>=75 && num6<=79){
                        gpa = gpa + 3.75;
                        tv6.setText("A");
                        avarage = avarage+num6;

                    }
                    else if (num6>=70 && num6<=74){
                        tv6.setText("A-");
                        gpa = gpa +3.50;
                        avarage = avarage+num6;

                    }
                    else if (num6>=65&& num6<=69){
                        tv2.setText("B+");
                        gpa = gpa +3.25;
                        avarage = avarage+num6;

                    }
                    else if (num6>=60 && num6<=64){
                        tv2.setText("B");
                        gpa = gpa +3.00;
                        avarage = avarage+num6;

                    }
                    else if (num6>=55 && num6<=59){
                        tv6.setText("B-");
                        gpa = gpa +2.75;
                        avarage = avarage+num6;

                    }
                    else if (num6>=50 && num6<=54){
                        tv6.setText("C+");
                        gpa = gpa +2.50;
                        avarage = avarage+num6;

                    }
                    else if (num6>=45 && num6<=49){
                        tv2.setText("C");
                        gpa = gpa +2.25;
                        avarage = avarage+num6;

                    }
                    else if (num6>=40 && num6<=44){
                        tv2.setText("D");
                        gpa = gpa +2.00;
                        avarage = avarage+num6;

                    } else{
                        tv6.setText("F");
                        gpa = gpa +0.00;
                        avarage = avarage+num6;


                    }


                    if(num7>=80 && num7<=100){
                        tv7.setText("A+");
                        gpa = gpa + 4.00;
                        avarage = avarage+num7;
                    }
                    else if (num7>=75 && num7<=79){
                        gpa = gpa + 3.75;
                        tv7.setText("A");
                        avarage = avarage+num7;

                    }
                    else if (num7>=70 && num7<=74){
                        tv7.setText("A-");
                        gpa = gpa +3.50;
                        avarage = avarage+num7;

                    }
                    else if (num7>=65&& num7<=69){
                        tv7.setText("B+");
                        gpa = gpa +3.25;
                        avarage = avarage+num7;

                    }
                    else if (num7>=60 && num7<=64){
                        tv7.setText("B");
                        gpa = gpa +3.00;
                        avarage = avarage+num7;

                    }
                    else if (num7>=55 && num7<=59){
                        tv7.setText("B-");
                        gpa = gpa +2.75;
                        avarage = avarage+num7;

                    }
                    else if (num7>=50 && num7<=54){
                        tv2.setText("C+");
                        gpa = gpa +2.50;
                        avarage = avarage+num7;

                    }
                    else if (num7>=45 && num7<=49){
                        tv7.setText("C");
                        gpa = gpa +2.25;
                        avarage = avarage+num7;

                    }
                    else if (num7>=40 && num7<=44){
                        tv7.setText("D");
                        gpa = gpa +2.00;
                        avarage = avarage+num7;

                    } else{
                        tv7.setText("F");
                        gpa = gpa +0.00;
                        avarage = avarage+num7;


                    }
                    avarage = avarage/7;
                    tv8.setText(Double.toString(avarage));
                    gpa = gpa/7;
                    tv9.setText("CGPA = "+ Double.toString( gpa));






                }







            }
        });
        recat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                avarage = 0;
                tv8.setText(""+avarage);
                gpa = 0;
                tv9.setText(""+gpa);
                avarage = 0;

                dfk = tv1.getText().toString();
                dfk = "";
                tv1.setText(dfk);

                TV2 = tv2.getText().toString();
                TV2 ="";
                tv2.setText(""+TV2);

                TV3 = tv3.getText().toString();
                TV3 ="";
                tv3.setText(""+TV3);

                TV4 = tv4.getText().toString();
                TV4 ="";
                tv4.setText(""+TV4);

                TV5 = tv5.getText().toString();
                TV5 ="";
                tv5.setText(""+TV5);

                TV6 = tv6.getText().toString();
                TV6 ="";
                tv6.setText(""+TV6);

                TV7 = tv6.getText().toString();
                TV7 ="";
                tv7.setText(""+TV7);

                name1 = ednum1.getText().toString();
                name1 = "";
                ednum1.setText(""+name1);

                name2 = ednum2.getText().toString();
                name2 = "";
                ednum2.setText(""+name2);

                name3 = ednum3.getText().toString();
                name3 = "";
                ednum3.setText(""+name3);

                name4 = ednum4.getText().toString();
                name4 = "";
                ednum4.setText(""+name4);

                name5 = ednum5.getText().toString();
                name5 = "";
                ednum5.setText(""+name5);

                name6 = ednum6.getText().toString();
                name6 = "";
                ednum6.setText(""+name6);

                name7 = ednum7.getText().toString();
                name7 = "";
                ednum7.setText(""+name7);

                subj7 = editText7.getText().toString();
                subj7= "";
                editText7.setText(""+subj7);




                subj1 = editText.getText().toString();
                subj1 = "";
                editText.setText(""+subj1);

                subj2 = editText1.getText().toString();
                subj2 = "";
                editText1.setText(""+subj2);

                subj3 = editText2.getText().toString();
                subj3 = "";
                editText2.setText(""+subj3);


                subj4 = editText3.getText().toString();
                subj4 = "";
                editText3.setText(""+subj4);


                subj5 = editText4.getText().toString();
                subj5 = "";
                editText4.setText(""+subj5);


                subj6 = editText5.getText().toString();
                subj6 = "";
                editText5.setText(""+subj6);

                subj7 = editText6.getText().toString();
                subj7 = "";
                editText6.setText(""+subj7);










            }
        });




        bottomNavigation = findViewById(R.id.bottomNavigation);




        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_round_app_shortcut_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_round_read_more_24));

        bottomNavigation.show(2,true);


        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model item) {
                // YOUR CODES
                switch (item.getId())
                {
                    case 1:
                        Toast.makeText(MainActivity.this,"হোম মেনুতে আপনাকে স্বাগতম",Toast.LENGTH_SHORT).show();
                        visigpa.setVisibility(View.VISIBLE);
                        visiif.setVisibility(View.GONE);
                        visieli.setVisibility(View.GONE);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"আপনাকে স্বাগতম",Toast.LENGTH_SHORT).show();
                        visiif.setVisibility(View.VISIBLE);
                        visigpa.setVisibility(View.GONE);
                        visieli.setVisibility(View.GONE);

                        break;
                    case 3:
                        Toast.makeText(MainActivity.this,"আপনাকে স্বাগতম",Toast.LENGTH_SHORT).show();
                        visieli.setVisibility(View.VISIBLE);
                        visiif.setVisibility(View.GONE);
                        visigpa.setVisibility(View.GONE);

                        break;











                }


                return null;
            }
        });



        edweekday  = findViewById(R.id.edweekday);
        edleapyear = findViewById(R.id.edleapyear);
        eddivide = findViewById(R.id.eddivde);
        tvdisplay1 = findViewById(R.id.tvdisplay1);
        tvdisplay2 = findViewById(R.id.tvdisplay2);
        tvdisplay3 = findViewById(R.id.tvdisplay3);


        total2 = findViewById(R.id.total2);
        total1 = findViewById(R.id.total1);
        total = findViewById(R.id.total);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = eddivide.getText().toString();
                if(eddivide.length()>0){
                    int divide = Integer.parseInt(name);

                    if (divide % 5 == 0 || divide % 5 == 5){
                        tvdisplay1.setText(divide+" is divisible by 5 and 11");
                    }
                    else  if (divide % 11 ==0){
                        tvdisplay1.setText(divide+" is divisible by 11");
                    }else {
                        tvdisplay1.setText(divide+" is not divisible by 5 and 11");
                    }

                }else {
                    eddivide.setError("Please enter the number");

                }




            }
        });

        //--------------------------------------leap year
        total1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String leap = edleapyear.getText().toString();
                if (edleapyear.length()>0){
                    int leapyear = Integer.parseInt(leap);
                    if(leapyear%400==0){
                        tvdisplay2.setText(leapyear+" is Leap Year");
                    }
                    else if (leapyear%4==0 && leapyear%100!=0){
                        tvdisplay2.setText(leapyear+" is Leap Year");
                    }else {
                        tvdisplay2.setText(leapyear+" is not Leap Year");
                    }

                }else {
                    edleapyear.setError("Please enter the number");
                }
            }
        });
        total2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String day = edweekday.getText().toString();
                if (edweekday.length()>0){
                    int week = Integer.parseInt(day);
                    if (week == 1){
                        tvdisplay3.setText("Saturday, so Collage off day");
                    }
                    else if ( week == 2){
                        tvdisplay3.setText("Sunday, so Collage open day");

                    }
                    else if ( week == 3){
                        tvdisplay3.setText("Monday, so Collage open day");

                    }
                    else if ( week == 4){
                        tvdisplay3.setText("Tuesday, so Collage open day");

                    }
                    else if ( week == 5){
                        tvdisplay3.setText("Wednesday, so Collage open day");

                    }
                    else if ( week == 6){
                        tvdisplay3.setText("Thursday, so Collage open day");

                    }
                    else if ( week == 7){
                        tvdisplay3.setText("Friday, so Collage off day");


                    }else {
                        tvdisplay3.setText("Number is not count");

                    }

                }else {
                    edweekday.setError("Please enter the number");

                }
            }
        });





    }


}