package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ne */
/* loaded from: classes2.dex */
public class C4158ne implements InterfaceC4002he {

    /* renamed from: a */
    @NonNull
    private final Context f46006a;

    /* renamed from: b */
    @NonNull
    private final String f46007b;

    /* renamed from: c */
    @NonNull
    private final C3729Wn f46008c;

    public C4158ne(@NonNull Context context, @NonNull String str, @NonNull C3729Wn c3729Wn) {
        this.f46006a = context;
        this.f46007b = str;
        this.f46008c = c3729Wn;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4002he
    @NonNull
    /* renamed from: a */
    public List<C4028ie> mo20012a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo m19373b = this.f46008c.m19373b(this.f46006a, this.f46007b, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
        if (m19373b != null) {
            for (String str : m19373b.requestedPermissions) {
                arrayList.add(new C4028ie(str, true));
            }
        }
        return arrayList;
    }
}
