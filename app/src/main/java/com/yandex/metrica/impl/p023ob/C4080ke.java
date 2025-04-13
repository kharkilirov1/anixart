package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

@TargetApi
/* renamed from: com.yandex.metrica.impl.ob.ke */
/* loaded from: classes2.dex */
class C4080ke implements InterfaceC4002he {

    /* renamed from: a */
    private final Context f45614a;

    /* renamed from: b */
    private final C3729Wn f45615b;

    @VisibleForTesting
    public C4080ke(Context context, @NonNull C3729Wn c3729Wn) {
        this.f45614a = context;
        this.f45615b = c3729Wn;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4002he
    @NonNull
    /* renamed from: a */
    public List<C4028ie> mo20012a() {
        ArrayList arrayList = new ArrayList();
        C3729Wn c3729Wn = this.f45615b;
        Context context = this.f45614a;
        PackageInfo m19373b = c3729Wn.m19373b(context, context.getPackageName(), RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
        if (m19373b == null) {
            return arrayList;
        }
        String[] strArr = m19373b.requestedPermissions;
        int[] iArr = m19373b.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr == null || iArr.length <= i2 || (iArr[i2] & 2) == 0) {
                arrayList.add(new C4028ie(str, false));
            } else {
                arrayList.add(new C4028ie(str, true));
            }
        }
        return arrayList;
    }
}
