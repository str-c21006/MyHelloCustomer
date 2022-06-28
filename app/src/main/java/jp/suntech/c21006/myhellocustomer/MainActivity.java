package jp.suntech.c21006.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick=findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();//リスナのインスタンス生成
        btClick.setOnClickListener(listener);//ボタンにリスナを組み込む

        Button btClear=findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);

        Button btAddressclear=findViewById(R.id.btAddressclear);
        btAddressclear.setOnClickListener(listener);
    }

    //    リスナ.クラス<=イベントの監視
    private class HelloListener implements View.OnClickListener{

        //        イベントハンドラ<=イベント発生時の処理
        @Override
        public void onClick(View view) {
            EditText input1=findViewById(R.id.etName);
            EditText input2=findViewById(R.id.etAddress);
            TextView output=findViewById(R.id.tvOutput);

            int id=view.getId();
            switch (id) {
                case R.id.btClick:
                    String inputStr1=input1.getText().toString();
                    String inputStr2=input2.getText().toString();
                    output.setText(inputStr2+"にお住いの"+inputStr1+"さん、こんにちは！");
                    break;

                case R.id.btClear:
                    input1.setText("");


                    break;

                case R.id.btAddressclear:
                    input2.setText("");

                    break;
            }

        }
    }
}