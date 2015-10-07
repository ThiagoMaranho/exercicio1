package com.example.provathiago;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prova extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prova);

		final TextView txt = (TextView) findViewById(R.id.txtNome);
		final EditText edt = (EditText) findViewById(R.id.edtNome);
		Button btn = (Button) findViewById(R.id.btnNome);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String string = edt.getText().toString();

				string = "Seja bem vindo  " + string;
				txt.setText(string);
			}
		});

	}
}
