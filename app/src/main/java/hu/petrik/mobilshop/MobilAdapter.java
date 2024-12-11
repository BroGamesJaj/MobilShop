package hu.petrik.mobilshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MobilAdapter extends BaseAdapter {
    private List<Mobil> mobilok;
    private Context context;

    public MobilAdapter(List<Mobil> mobilok, Context context) {
        this.mobilok = mobilok;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mobilok.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.list_of_mobils_item, viewGroup, false);
        TextView nevTextView = view.findViewById(R.id.nevTV);
        TextView mennyTextView = view.findViewById(R.id.mennyTV);
        TextView arTextView = view.findViewById(R.id.arTV);
        TextView katTextView = view.findViewById(R.id.katTV);

        nevTextView.setText(mobilok.get(i).getNev());
        mennyTextView.setText(mobilok.get(i).getMennyiseg());
        arTextView.setText(mobilok.get(i).getAr());
        katTextView.setText(mobilok.get(i).getKategoria());
        return view;
    }
}
