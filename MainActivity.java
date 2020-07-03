package duytran.ttd.appstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MyMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Print Log
        Log.i(TAG, "onCreate");

        // Lấy ra button theo ID
        Button button1 = this.findViewById(R.id.button1);

        // Sét đặt sự kiện Click vào Button2.
        button1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example2Activity).
                Intent myIntent = new Intent(MainActivity.this, MainD.class);

                // Yêu cầu chạy Example2Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });


        // Lấy ra button theo ID
        Button button2 = this.findViewById(R.id.button2);

        // Sét đặt sự kiện Click vào Button2.
        button2.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example2Activity).
                Intent myIntent = new Intent(MainActivity.this, MainD2.class);

                // Yêu cầu chạy Example2Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });


        // Lấy ra button theo ID
        Button button3 = this.findViewById(R.id.button3);

        // Sét đặt sự kiện Click vào Button3.
        button3.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example3Activity).
                Intent myIntent = new Intent(MainActivity.this, MainD3.class);

                // Yêu cầu chạy Example3Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });


        // Lấy ra button theo ID
        Button button4 = this.findViewById(R.id.button4);

        // Sét đặt sự kiện Click vào Button4.
        button4.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example2Activity).
                Intent myIntent = new Intent(MainActivity.this, MainD4.class);

                // Yêu cầu chạy Example4Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });


        // Lấy ra button theo ID
        Button button5 = this.findViewById(R.id.button5);

        // Sét đặt sự kiện Click vào Button5.
        button5.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example5Activity).
                Intent myIntent = new Intent(MainActivity.this, MainD5.class);

                // Yêu cầu chạy Example5Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });

        // Lấy ra button theo ID
        Button button6 = this.findViewById(R.id.button6);

        // Sét đặt sự kiện Click vào Button5.
        button6.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example5Activity).
                Intent myIntent = new Intent(MainActivity.this, MainD6.class);

                // Yêu cầu chạy Example5Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });

        // Lấy ra button theo ID
        Button button7 = this.findViewById(R.id.button7);

        // Sét đặt sự kiện Click vào Button5.
        button7.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example5Activity).
                Intent myIntent = new Intent(MainActivity.this, MainListView.class);

                // Yêu cầu chạy Example5Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });

        // Lấy ra button theo ID
        Button button8 = this.findViewById(R.id.button8);

        // Sét đặt sự kiện Click vào Button5.
        button8.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example5Activity).
                Intent myIntent = new Intent(MainActivity.this, ListViewCustom.class);

                // Yêu cầu chạy Example5Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        // Print Log
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Print Log
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Print Log
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Print Log
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Print Log
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // Print Log
        Log.i(TAG, "onRestart");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu);

        // Print Log
        Log.i(TAG, "onCreateOptionsMenu");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Print Log
        Log.i(TAG, "onOptionsItemSelected");

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}