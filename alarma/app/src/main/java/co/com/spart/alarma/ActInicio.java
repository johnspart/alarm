package co.com.spart.alarma;


import android.app.Activity;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringArrayRes;

import java.util.ArrayList;
import java.util.List;

import co.com.spart.alarm.beans.MenuItem;
import co.com.spart.utils.MenuArrayAdapter;

/**
 * Created by john on 13/06/16.
 */
@EActivity(R.layout.activity_inicio)
public class ActInicio extends Activity {

    @StringArrayRes(R.array.menu_items)
    String[] menuItems;

    @ViewById(R.id.lstMenuApp)
    ListView lstMenuApp;

    @AfterViews
    public void afterViews() {
        this.lstMenuApp.setAdapter(new MenuArrayAdapter(this, this.getMenuItems()));

    }


    private List<MenuItem> getMenuItems(){
        List<MenuItem> lst = new ArrayList<MenuItem>();
        lst.add(new MenuItem(R.mipmap.ic_alarm_black, this.menuItems[0]));
        lst.add(new MenuItem(R.mipmap.ic_alarm_black, this.menuItems[1]));
        lst.add(new MenuItem(R.mipmap.ic_alarm_black, this.menuItems[2]));
        lst.add(new MenuItem(R.mipmap.ic_alarm_black, this.menuItems[3]));
        lst.add(new MenuItem(R.mipmap.ic_alarm_black, this.menuItems[4]));
        lst.add(new MenuItem(R.mipmap.ic_alarm_black, this.menuItems[5]));

        return lst;
    }
}
