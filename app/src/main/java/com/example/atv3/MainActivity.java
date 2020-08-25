package com.example.atv3;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout dLayout;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabAdapter adapter;
    private Toolbar myToolbar;
    private Boolean theme = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager(), 2);
        adapter.addFragment(new InfoRegioes(Regioes.getBrasil()), new EstadosFragment(Estados.getEstados()));

        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dLayout.openDrawer(Gravity.LEFT);
            }
        });

        setNavigationDrawer();
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.translate) {
            Toast.makeText(getApplicationContext(), "Clicou no Tradutor", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.refresh) {
            Toast.makeText(getApplicationContext(), "Clicou no Refresh!", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.settings) {
            Toast.makeText(getApplicationContext(), "Clicou no Settings!", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setNavigationDrawer() {
        dLayout = findViewById(R.id.drawer_layout);

        NavigationView navView = findViewById(R.id.navigation);
        navView.setItemIconTintList(null);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                Fragment fragInfo = null;
                Fragment fragEstados = null;
                int itemId = menuItem.getItemId();

                if (itemId == R.id.regiao_norte) {
                    fragInfo = new InfoRegioes(Regioes.getNorte());
                    fragEstados = new EstadosFragment(Estados.getEstadosNorte());
                } else if (itemId == R.id.regiao_nordeste) {
                    fragInfo = new InfoRegioes(Regioes.getNortedeste());
                    fragEstados = new EstadosFragment(Estados.getEstadosNordeste());
                } else if (itemId == R.id.regiao_centro_oeste) {
                    fragInfo = new InfoRegioes(Regioes.getCentroOeste());
                    fragEstados = new EstadosFragment(Estados.getEstadosCentroOeste());
                } else if (itemId == R.id.regiao_sul) {
                    fragInfo = new InfoRegioes(Regioes.getSul());
                    fragEstados = new EstadosFragment(Estados.getEstadosSul());
                } else if (itemId == R.id.regiao_sudeste) {
                    fragInfo = new InfoRegioes(Regioes.getSuldeste());
                    fragEstados = new EstadosFragment(Estados.getEstadosSudeste());
                } else if (itemId == R.id.brasil) {
                    fragInfo = new InfoRegioes(Regioes.getBrasil());
                    fragEstados = new EstadosFragment(Estados.getEstados());
                }
                myToolbar.setTitle(menuItem.getTitle());

                if (fragInfo != null && fragEstados != null) {
                    adapter.replaceFragment(fragInfo, fragEstados);
                    viewPager.setAdapter(adapter);
                    tabLayout.setupWithViewPager(viewPager);

                    dLayout.closeDrawers();
                    return true;
                }
                return false;
            }
        });
    }

}