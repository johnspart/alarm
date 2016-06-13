package co.com.spart.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import co.com.spart.alarm.beans.MenuItem;
import co.com.spart.alarma.R;

/**
 * Created by john on 13/06/16.
 */
public class MenuArrayAdapter extends ArrayAdapter<MenuItem> {
    private final List<MenuItem> menuItems;
    private final Context context;

    public MenuArrayAdapter(Context context, MenuItem... menuItemItems) {
        super(context, -1, menuItemItems);
        this.context = context;
        this.menuItems = Arrays.asList(menuItemItems);
    }

    public MenuArrayAdapter(Context context, List<MenuItem> menuItemItems) {
        super(context, -1, menuItemItems);
        this.context = context;
        this.menuItems = menuItemItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.menu_item, parent, false);

        ImageView imagen = (ImageView) rowView.findViewById(R.id.imvIconMenu);
        TextView descripcion = (TextView) rowView.findViewById(R.id.txvDsMenu);

        MenuItem menuItem = this.getItem(position);
        imagen.setImageResource(menuItem.getIconId());
        descripcion.setText(menuItem.getDescripcion());

        return rowView;
    }

    @Override
    public int getCount() {
        return this.menuItems.size();
    }

    @Override
    public MenuItem getItem(int position) {
        return this.menuItems.get(position);
    }

}
