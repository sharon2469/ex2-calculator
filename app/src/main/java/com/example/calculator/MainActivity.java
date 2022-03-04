package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText edNum1, edNum2, edResult;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNum1 = findViewById(R.id.edOperand1);
        edNum2 = findViewById(R.id.edOperand2);
        txtResult = findViewById(R.id.txtRes);
    }


    /**This function handle the click on operation buttons*/
    public void operationButtonClicked(View view){
        int btId, sum = 0, num1, num2;
        String tempString;
        if (!(view instanceof Button)) {
            Log.e("Error:", "view is not an instance of Button");
            return;
        }

        if(checkForEnterNumbers() != true){
            return;
        }

        btId = ((Button)view).getId();
        num1 = Integer.valueOf(edNum1.getText().toString());
        num2 = Integer.valueOf(edNum2.getText().toString());

        switch (btId){
            case R.id.btAdd:
                Log.i("Oparation","Add");
                sum = num1 + num2;
                break;
            case R.id.btSub:
                Log.i("Oparation","Subtraction");
                sum = num1 - num2;
                break;
            case R.id.btMul:
                Log.i("Oparation","Multiplication");
                sum = num1 * num2;
                break;
            case R.id.btDiv:
                Log.i("Oparation","Division");
                if(num2 == 0){
                    Log.e("Error oparation","Attempt divid by zero");
                    showToast(getString(R.string.ERROR_DIVIDE_BY_ZERO));
                    txtResult.setText("");
                    return;
                }
                if(num1 % num2 == 0){
                    sum = num1 / num2;
                }else{
                    tempString = String.format(Locale.getDefault(), "%.2f", num1 / (float) num2);
                    txtResult.setText(tempString);
                    return;
                }
                break;
        }

        txtResult.setText(""+sum);

    }


    /** This function check if the user enter in both edittext number, if not then show toast message*/
    public boolean checkForEnterNumbers(){
        if(edNum1.getText().length() == 0 || edNum2.getText().length() == 0){
            showToast(getString(R.string.ERROR_OPERANDS_NOT_VALID));
            return false;
        }
        return true;
    }

    /**This function get text and show Toast message*/
    public void showToast(String text){
        Toast toast = Toast.makeText(this,text,Toast.LENGTH_SHORT);
        toast.show();
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("res", txtResult.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        txtResult.setText(savedInstanceState.getString("res"));
    }
}




