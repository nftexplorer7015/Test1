package me.saket.dank.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Utility methods for the soft-keyboard.
 */
public class Keyboards {

    /**
     * Show the keyboard on <var>editText</var>.
     */
    public static void show(EditText editText) {
        editText.requestFocus();
        InputMethodManager imm = (InputMethodManager) editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
    }

    /**
     * Hide the keyboard.
     */
    public static void hide(Context context, View anyViewInLayout) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(anyViewInLayout.getWindowToken(), 0);
    }

}