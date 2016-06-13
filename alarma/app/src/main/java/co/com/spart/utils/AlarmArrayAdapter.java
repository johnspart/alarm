package co.com.spart.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import co.com.spart.alarm.beans.Alarma;
import co.com.spart.alarma.R;

/**
 * Created by john on 12/06/16.
 */
public class AlarmArrayAdapter extends ArrayAdapter<Alarma> {
    private final List<Alarma> alarmas;
    private final Context context;

    public AlarmArrayAdapter(Context context, Alarma... alarmas) {
        super(context, -1, alarmas);
        this.context = context;
        this.alarmas = Arrays.asList(alarmas);
    }

    public AlarmArrayAdapter(Context context, List<Alarma> alarmas) {
        super(context, -1, alarmas);
        this.context = context;
        this.alarmas = alarmas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Alarma alarma = this.alarmas.get(position);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_alarma, parent, false);

        TextView dsAlarma = (TextView) rowView.findViewById(R.id.txvDsAlarma);
        TextView repeticion = (TextView) rowView.findViewById(R.id.txvRepeticion);

        dsAlarma.setText(alarma.getDescripcion());
        repeticion.setText(alarma.getPeriodo().getDescripcion());

        return rowView;
    }

    @Override
    public int getCount() {
        return this.alarmas.size();
    }

    @Override
    public Alarma getItem(int position) {
        return this.alarmas.get(position);
    }

}
