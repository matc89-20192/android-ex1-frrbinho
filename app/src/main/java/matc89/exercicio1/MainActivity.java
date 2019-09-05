package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }


    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        EditText editarTexto = (EditText)findViewById(R.id.editNome);
        String texto = savedInstanceState.getString(editarTexto.getText().toString());
        }

    public void alterarTexto(View v) {
        EditText editarTexto = (EditText)findViewById(R.id.editNome);
        TextView mensagem = (TextView)findViewById(R.id.labelMensagem);
        String texto = editarTexto.getText().toString();

        mensagem.setText("Alô, "+ texto+"!");

    }
}
