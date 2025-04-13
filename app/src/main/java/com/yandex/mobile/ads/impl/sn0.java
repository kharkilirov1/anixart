package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class sn0 {

    /* renamed from: a */
    @NonNull
    private final db1 f54784a;

    /* renamed from: b */
    @NonNull
    private final yn0 f54785b;

    /* renamed from: c */
    @NonNull
    private final io0 f54786c = new io0();

    public sn0(@NonNull Context context, @NonNull db1 db1Var) {
        this.f54784a = db1Var;
        this.f54785b = new yn0(context);
    }

    @Nullable
    /* renamed from: a */
    public final tl1 m28342a(@NonNull ArrayList arrayList) throws IllegalStateException {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ab1 ab1Var = (ab1) it.next();
            try {
                Objects.requireNonNull(this.f54786c);
                arrayList2.add(io0.m25585a(ab1Var));
            } catch (cb1 e2) {
                this.f54784a.mo23863a(e2);
            } catch (Exception e3) {
                n60.m26808a(e3, e3.getMessage(), new Object[0]);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return AbstractC5566p5.m27164a(C5620q5.m27625a(), C5670r5.m27834a(fp0.m24720a(BuildConfigFieldProvider.getVersion()), this.f54785b.m29953a(), arrayList2));
    }
}
