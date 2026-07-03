package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.ActionBar;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class EncoGramSettingsActivity extends BaseFragment {

    @Override
    public View createView(Context context) {
        
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setAllowOverlayTitle(true);
        actionBar.setTitle("EncoGram");
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) finishFragment(); 
            }
        });
        
        
        FrameLayout frameLayout = new FrameLayout(context);
        fragmentView = frameLayout;
        return fragmentView;
    }
}
