package com.swiftsoft.anixartd.utils.filepicker.controller.adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.filepicker.controller.NotifyItemChecked;
import com.swiftsoft.anixartd.utils.filepicker.model.DialogProperties;
import com.swiftsoft.anixartd.utils.filepicker.model.FileListItem;
import com.swiftsoft.anixartd.utils.filepicker.model.MarkedItemList;
import com.swiftsoft.anixartd.utils.filepicker.widget.MaterialCheckbox;
import com.swiftsoft.anixartd.utils.filepicker.widget.OnCheckedChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public class FileListAdapter extends BaseAdapter {

    /* renamed from: b */
    public ArrayList<FileListItem> f30487b;

    /* renamed from: c */
    public Context f30488c;

    /* renamed from: d */
    public DialogProperties f30489d;

    /* renamed from: e */
    public NotifyItemChecked f30490e;

    public class ViewHolder {

        /* renamed from: a */
        public ImageView f30493a;

        /* renamed from: b */
        public TextView f30494b;

        /* renamed from: c */
        public TextView f30495c;

        /* renamed from: d */
        public MaterialCheckbox f30496d;

        public ViewHolder(FileListAdapter fileListAdapter, View view) {
            this.f30494b = (TextView) view.findViewById(C2507R.id.fname);
            this.f30495c = (TextView) view.findViewById(C2507R.id.ftype);
            this.f30493a = (ImageView) view.findViewById(C2507R.id.image_type);
            this.f30496d = (MaterialCheckbox) view.findViewById(C2507R.id.file_mark);
        }
    }

    public FileListAdapter(ArrayList<FileListItem> arrayList, Context context, DialogProperties dialogProperties) {
        this.f30487b = arrayList;
        this.f30488c = context;
        this.f30489d = dialogProperties;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f30487b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return this.f30487b.get(i2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.f30488c).inflate(C2507R.layout.dialog_filepicker_file_list_item, viewGroup, false);
            viewHolder = new ViewHolder(this, view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        final FileListItem fileListItem = this.f30487b.get(i2);
        if (MarkedItemList.f30505a.containsKey(fileListItem.f30501c)) {
            view.setAnimation(AnimationUtils.loadAnimation(this.f30488c, C2507R.anim.marked_item_animation));
        } else {
            view.setAnimation(AnimationUtils.loadAnimation(this.f30488c, C2507R.anim.unmarked_item_animation));
        }
        if (fileListItem.f30502d) {
            viewHolder.f30493a.setImageResource(C2507R.mipmap.ic_type_folder);
            if (Build.VERSION.SDK_INT >= 23) {
                viewHolder.f30493a.setColorFilter(this.f30488c.getResources().getColor(C2507R.color.colorAccent, this.f30488c.getTheme()));
            } else {
                viewHolder.f30493a.setColorFilter(this.f30488c.getResources().getColor(C2507R.color.colorAccent));
            }
            Objects.requireNonNull(this.f30489d);
            viewHolder.f30496d.setVisibility(4);
        } else {
            viewHolder.f30493a.setImageResource(C2507R.mipmap.ic_type_file);
            if (Build.VERSION.SDK_INT >= 23) {
                viewHolder.f30493a.setColorFilter(this.f30488c.getResources().getColor(C2507R.color.colorAccent, this.f30488c.getTheme()));
            } else {
                viewHolder.f30493a.setColorFilter(this.f30488c.getResources().getColor(C2507R.color.colorAccent));
            }
            Objects.requireNonNull(this.f30489d);
            viewHolder.f30496d.setVisibility(0);
        }
        viewHolder.f30493a.setContentDescription(fileListItem.f30500b);
        viewHolder.f30494b.setText(fileListItem.f30500b);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        Date date = new Date(fileListItem.f30504f);
        if (i2 == 0 && fileListItem.f30500b.startsWith(this.f30488c.getString(C2507R.string.label_parent_dir))) {
            viewHolder.f30495c.setText(C2507R.string.label_parent_directory);
        } else {
            viewHolder.f30495c.setText(this.f30488c.getString(C2507R.string.last_edit) + simpleDateFormat.format(date) + " " + simpleDateFormat2.format(date));
        }
        if (viewHolder.f30496d.getVisibility() == 0) {
            if (i2 == 0 && fileListItem.f30500b.startsWith(this.f30488c.getString(C2507R.string.label_parent_dir))) {
                viewHolder.f30496d.setVisibility(4);
            }
            if (MarkedItemList.f30505a.containsKey(fileListItem.f30501c)) {
                viewHolder.f30496d.setChecked(true);
            } else {
                viewHolder.f30496d.setChecked(false);
            }
        }
        viewHolder.f30496d.setOnCheckedChangedListener(new OnCheckedChangeListener() { // from class: com.swiftsoft.anixartd.utils.filepicker.controller.adapters.FileListAdapter.1
            @Override // com.swiftsoft.anixartd.utils.filepicker.widget.OnCheckedChangeListener
            /* renamed from: a */
            public void mo16460a(MaterialCheckbox materialCheckbox, boolean z) {
                FileListItem fileListItem2 = fileListItem;
                fileListItem2.f30503e = z;
                if (z) {
                    Objects.requireNonNull(FileListAdapter.this.f30489d);
                    FileListItem fileListItem3 = fileListItem;
                    HashMap<String, FileListItem> hashMap = MarkedItemList.f30505a;
                    HashMap<String, FileListItem> hashMap2 = new HashMap<>();
                    MarkedItemList.f30505a = hashMap2;
                    hashMap2.put(fileListItem3.f30501c, fileListItem3);
                } else {
                    MarkedItemList.f30505a.remove(fileListItem2.f30501c);
                }
                FileListAdapter.this.f30490e.mo16459a();
            }
        });
        return view;
    }
}
