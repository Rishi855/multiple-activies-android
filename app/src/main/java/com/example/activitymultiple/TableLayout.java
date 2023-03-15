package com.example.activitymultiple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.Toast;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        getSupportActionBar().setTitle("Table Layout");

        TableRow tr1 = findViewById(R.id.tr1);
        tr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b1 = findViewById(R.id.l1t1);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b1.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b2 = findViewById(R.id.l1t2);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b2.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b3 = findViewById(R.id.l1t3);
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b3.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b4 = findViewById(R.id.l1t4);
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b4.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        TableRow tr2 = findViewById(R.id.tr2);
        tr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b1 = findViewById(R.id.l2t1);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b1.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b2 = findViewById(R.id.l2t2);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b2.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b3 = findViewById(R.id.l2t3);
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b3.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b4 = findViewById(R.id.l2t4);
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b4.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        TableRow tr3 = findViewById(R.id.tr3);
        tr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b1 = findViewById(R.id.l3t1);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b1.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b2 = findViewById(R.id.l3t2);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b2.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b3 = findViewById(R.id.l3t3);
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b3.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b4 = findViewById(R.id.l3t4);
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b4.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        TableRow tr4 = findViewById(R.id.tr4);
        tr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b1 = findViewById(R.id.l4t1);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b1.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b2 = findViewById(R.id.l4t2);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b2.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b3 = findViewById(R.id.l4t3);
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b3.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
                Button b4 = findViewById(R.id.l4t4);
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b4.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        TableRow tr5 = findViewById(R.id.tr5);
        tr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b1 = findViewById(R.id.l5t1);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(TableLayout.this,b1.getText().toString()+" is pressed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        Intent nextPage = new Intent(getApplicationContext(),SpaceLayout.class);
        Button btn = findViewById(R.id.btnLayoutTable);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextPage);
            }
        });
    }
}