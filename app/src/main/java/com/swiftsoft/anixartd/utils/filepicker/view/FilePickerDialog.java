package com.swiftsoft.anixartd.utils.filepicker.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.filepicker.controller.DialogSelectionListener;
import com.swiftsoft.anixartd.utils.filepicker.controller.NotifyItemChecked;
import com.swiftsoft.anixartd.utils.filepicker.controller.adapters.FileListAdapter;
import com.swiftsoft.anixartd.utils.filepicker.model.DialogProperties;
import com.swiftsoft.anixartd.utils.filepicker.model.FileListItem;
import com.swiftsoft.anixartd.utils.filepicker.model.MarkedItemList;
import com.swiftsoft.anixartd.utils.filepicker.utils.ExtensionFilter;
import com.swiftsoft.anixartd.utils.filepicker.utils.Utility;
import com.swiftsoft.anixartd.utils.filepicker.widget.MaterialCheckbox;
import com.yandex.mobile.ads.C4632R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class FilePickerDialog extends Dialog implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final Context f30508b;

    /* renamed from: c */
    public ListView f30509c;

    /* renamed from: d */
    public TextView f30510d;

    /* renamed from: e */
    public TextView f30511e;

    /* renamed from: f */
    public TextView f30512f;

    /* renamed from: g */
    public DialogProperties f30513g;

    /* renamed from: h */
    public DialogSelectionListener f30514h;

    /* renamed from: i */
    public ArrayList<FileListItem> f30515i;

    /* renamed from: j */
    public ExtensionFilter f30516j;

    /* renamed from: k */
    public FileListAdapter f30517k;

    /* renamed from: l */
    public Button f30518l;

    /* renamed from: m */
    public String f30519m;

    /* renamed from: n */
    public String f30520n;

    public FilePickerDialog(Context context) {
        super(context);
        this.f30519m = null;
        this.f30520n = null;
        this.f30508b = context;
        DialogProperties dialogProperties = new DialogProperties();
        this.f30513g = dialogProperties;
        this.f30516j = new ExtensionFilter(dialogProperties);
        this.f30515i = new ArrayList<>();
    }

    /* renamed from: a */
    public final void m16464a() {
        TextView textView = this.f30512f;
        if (textView == null || this.f30510d == null) {
            return;
        }
        if (this.f30519m == null) {
            if (textView.getVisibility() == 0) {
                this.f30512f.setVisibility(4);
            }
            if (this.f30510d.getVisibility() == 4) {
                this.f30510d.setVisibility(0);
                return;
            }
            return;
        }
        if (textView.getVisibility() == 4) {
            this.f30512f.setVisibility(0);
        }
        this.f30512f.setText(this.f30519m);
        if (this.f30510d.getVisibility() == 0) {
            this.f30510d.setVisibility(4);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        HashMap<String, FileListItem> hashMap = MarkedItemList.f30505a;
        MarkedItemList.f30505a = new HashMap<>();
        this.f30515i.clear();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        String charSequence = this.f30510d.getText().toString();
        if (this.f30515i.size() <= 0) {
            super.onBackPressed();
            return;
        }
        File file = new File(this.f30515i.get(0).f30501c);
        if (charSequence.equals(this.f30513g.f30497a.getName()) || !file.canRead()) {
            super.onBackPressed();
        } else {
            this.f30510d.setText(file.getName());
            this.f30511e.setText(file.getAbsolutePath());
            this.f30515i.clear();
            if (!file.getName().equals(this.f30513g.f30497a.getName())) {
                FileListItem fileListItem = new FileListItem();
                fileListItem.f30500b = this.f30508b.getString(C2507R.string.label_parent_dir);
                fileListItem.f30502d = true;
                fileListItem.f30501c = file.getParentFile().getAbsolutePath();
                fileListItem.f30504f = file.lastModified();
                this.f30515i.add(fileListItem);
            }
            this.f30515i = Utility.m16463b(this.f30515i, file, this.f30516j);
            this.f30517k.notifyDataSetChanged();
        }
        m16464a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C2507R.layout.dialog_filepicker_main);
        this.f30509c = (ListView) findViewById(C2507R.id.fileList);
        this.f30518l = (Button) findViewById(C2507R.id.select);
        if (MarkedItemList.m16461a() == 0) {
            this.f30518l.setEnabled(false);
        }
        this.f30510d = (TextView) findViewById(C2507R.id.dname);
        this.f30512f = (TextView) findViewById(C2507R.id.title);
        this.f30511e = (TextView) findViewById(C2507R.id.dir_path);
        Button button = (Button) findViewById(C2507R.id.cancel);
        this.f30518l.setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.utils.filepicker.view.FilePickerDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Set<String> keySet = MarkedItemList.f30505a.keySet();
                String[] strArr = new String[keySet.size()];
                Iterator<String> it = keySet.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    strArr[i2] = it.next();
                    i2++;
                }
                DialogSelectionListener dialogSelectionListener = FilePickerDialog.this.f30514h;
                if (dialogSelectionListener != null) {
                    dialogSelectionListener.mo16458a(strArr);
                }
                FilePickerDialog.this.dismiss();
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.utils.filepicker.view.FilePickerDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FilePickerDialog.this.cancel();
            }
        });
        FileListAdapter fileListAdapter = new FileListAdapter(this.f30515i, this.f30508b, this.f30513g);
        this.f30517k = fileListAdapter;
        fileListAdapter.f30490e = new NotifyItemChecked() { // from class: com.swiftsoft.anixartd.utils.filepicker.view.FilePickerDialog.3
            @Override // com.swiftsoft.anixartd.utils.filepicker.controller.NotifyItemChecked
            /* renamed from: a */
            public void mo16459a() {
                FilePickerDialog filePickerDialog = FilePickerDialog.this;
                String str = filePickerDialog.f30520n;
                if (str == null) {
                    str = filePickerDialog.f30508b.getResources().getString(C2507R.string.choose_button_label);
                }
                filePickerDialog.f30520n = str;
                if (MarkedItemList.m16461a() == 0) {
                    FilePickerDialog.this.f30518l.setEnabled(false);
                    FilePickerDialog filePickerDialog2 = FilePickerDialog.this;
                    filePickerDialog2.f30518l.setText(filePickerDialog2.f30520n);
                } else {
                    FilePickerDialog.this.f30518l.setEnabled(true);
                }
                Objects.requireNonNull(FilePickerDialog.this.f30513g);
                FilePickerDialog.this.f30517k.notifyDataSetChanged();
            }
        };
        this.f30509c.setAdapter((ListAdapter) fileListAdapter);
        m16464a();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        if (this.f30515i.size() > i2) {
            FileListItem fileListItem = this.f30515i.get(i2);
            if (!fileListItem.f30502d) {
                ((MaterialCheckbox) view.findViewById(C2507R.id.file_mark)).performClick();
                return;
            }
            if (!new File(fileListItem.f30501c).canRead()) {
                Toast.makeText(this.f30508b, C2507R.string.error_dir_access, 0).show();
                return;
            }
            File file = new File(fileListItem.f30501c);
            this.f30510d.setText(file.getName());
            m16464a();
            this.f30511e.setText(file.getAbsolutePath());
            this.f30515i.clear();
            if (!file.getName().equals(this.f30513g.f30497a.getName())) {
                FileListItem fileListItem2 = new FileListItem();
                fileListItem2.f30500b = this.f30508b.getString(C2507R.string.label_parent_dir);
                fileListItem2.f30502d = true;
                fileListItem2.f30501c = file.getParentFile().getAbsolutePath();
                fileListItem2.f30504f = file.lastModified();
                this.f30515i.add(fileListItem2);
            }
            this.f30515i = Utility.m16463b(this.f30515i, file, this.f30516j);
            this.f30517k.notifyDataSetChanged();
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        File file;
        super.onStart();
        String str = this.f30520n;
        if (str == null) {
            str = this.f30508b.getResources().getString(C2507R.string.choose_button_label);
        }
        this.f30520n = str;
        this.f30518l.setText(str);
        if (Utility.m16462a(this.f30508b)) {
            this.f30515i.clear();
            if (this.f30513g.f30499c.isDirectory()) {
                String absolutePath = this.f30513g.f30499c.getAbsolutePath();
                String absolutePath2 = this.f30513g.f30497a.getAbsolutePath();
                if (!absolutePath.equals(absolutePath2) && absolutePath.contains(absolutePath2)) {
                    file = new File(this.f30513g.f30499c.getAbsolutePath());
                    FileListItem fileListItem = new FileListItem();
                    fileListItem.f30500b = this.f30508b.getString(C2507R.string.label_parent_dir);
                    fileListItem.f30502d = true;
                    fileListItem.f30501c = file.getParentFile().getAbsolutePath();
                    fileListItem.f30504f = file.lastModified();
                    this.f30515i.add(fileListItem);
                    this.f30510d.setText(file.getName());
                    this.f30511e.setText(file.getAbsolutePath());
                    m16464a();
                    this.f30515i = Utility.m16463b(this.f30515i, file, this.f30516j);
                    this.f30517k.notifyDataSetChanged();
                    this.f30509c.setOnItemClickListener(this);
                }
            }
            file = (this.f30513g.f30497a.exists() && this.f30513g.f30497a.isDirectory()) ? new File(this.f30513g.f30497a.getAbsolutePath()) : new File(this.f30513g.f30498b.getAbsolutePath());
            this.f30510d.setText(file.getName());
            this.f30511e.setText(file.getAbsolutePath());
            m16464a();
            this.f30515i = Utility.m16463b(this.f30515i, file, this.f30516j);
            this.f30517k.notifyDataSetChanged();
            this.f30509c.setOnItemClickListener(this);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f30519m = charSequence.toString();
        } else {
            this.f30519m = null;
        }
        m16464a();
    }

    @Override // android.app.Dialog
    public void show() {
        if (!Utility.m16462a(this.f30508b)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((Activity) this.f30508b).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                return;
            }
            return;
        }
        super.show();
        String str = this.f30520n;
        if (str == null) {
            str = this.f30508b.getResources().getString(C2507R.string.choose_button_label);
        }
        this.f30520n = str;
        this.f30518l.setText(str);
        int m16461a = MarkedItemList.m16461a();
        if (m16461a == 0) {
            this.f30518l.setText(this.f30520n);
            return;
        }
        this.f30518l.setText(this.f30520n + " (" + m16461a + ") ");
    }
}
