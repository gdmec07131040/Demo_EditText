package cn.edu.gdmec.s07131040.demo_edittext;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et=(EditText) findViewById(R.id.editText1);
        et.setText("��Һã�����edittext");
        
        String text = et.getText().toString();
        
        Log.i("info", "edittext����ʾ�������ǣ�"+text);
        et.getText().clear();//��������
    }


}
