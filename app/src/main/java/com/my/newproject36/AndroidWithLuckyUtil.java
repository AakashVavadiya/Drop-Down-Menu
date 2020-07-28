package com.my.newproject36;

import android.content.Context;
import android.util.TypedValue;
import android.widget.Toast;

public class AndroidWithLuckyUtil {
    public static void showMessage(Context _context, String _s) {
        Toast.makeText(_context, _s, Toast.LENGTH_SHORT).show();
        }

public static float getDip(Context _context, int _input) {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, _context.getResources().getDisplayMetrics());
    }
}