package com.projectx.frl.menu.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public class MenuFragment extends Fragment implements View.OnClickListener {

    // Реализуем интерфейс и привяжем его для кэлбэков (Обратных вызовов)
    // В Активности имплементим этот интерфейс
    private OnButtonClickListener mCallBackClickListener;

    @Override
    public void onClick(View v) {
        mCallBackClickListener.onButtonPressed(v);
    }

    public interface OnButtonClickListener {
        void onButtonPressed(View view);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            // Инициализация кэлбека
            mCallBackClickListener = (OnButtonClickListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnButtonClickListener");
        }
    }
}
