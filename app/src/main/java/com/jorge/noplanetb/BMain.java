package com.jorge.noplanetb;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class BMain extends AppCompatActivity {


    RelativeLayout layout;

    SwipeRefreshLayout swipeLL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        layout =  findViewById(R.id.LinearTexto);
//
//        swipeLL = (SwipeRefreshLayout) findViewById(R.id.swipe_texto);
//        swipeLL.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                Snackbar snackbar = Snackbar.make(layout, "YEEEP", Snackbar.LENGTH_LONG);
//                snackbar.setAction("ACTION", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(getApplicationContext(), "Jorge Funchiona", Toast.LENGTH_LONG).show();
//                    }
//                });
//                snackbar.show();
//                swipeLL.setRefreshing(false);
//
//
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.actionSettings) {
            mensajeBonito(getString(R.string.ToastAjustes));
            return true;
        }
        if (id == R.id.corasaooo) {
            mensajeBonito(getString(R.string.ToastCorazon));

        }
        return super.onOptionsItemSelected(item);
    }

    public void leave(View view) {
       mensajeBonito(getString(R.string.ToastBotonLeave));
    }



    private void mensajeBonito(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }

    public void stay(View view) {
        mensajeBonito(getString(R.string.ToastStayBoton));
    }
}
