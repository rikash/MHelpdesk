package pl.activities;

import android.app.Activity;
import android.os.Bundle;

import helpdesk.pl.helpdesk.R;

/**
 * KK
 * aktywność po zalogowaniu
 */

public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }
}
