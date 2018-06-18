package com.projectx.frl.menu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.projectx.frl.R;
import com.projectx.frl.menu.fragment.MenuFragment;

public class MenuActivity extends AppCompatActivity implements MenuFragment.OnButtonClickListener {

    private FragmentManager mFragmentManager = getSupportFragmentManager();
    private Fragment mFragment;


    //private final ModuleInteractor mModuleInteractor = new ModuleInteractor();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_fragment_container);

        mFragment = mFragmentManager.findFragmentById(R.id.fragment_container);
        if (mFragment == null) {
            mFragment = new MenuFragment();
            mFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, mFragment)
                    .commit();
        }

    }

    @Override
    public void onButtonPressed(View view) {
        // Обрабатываем события кнопок

    }
}
