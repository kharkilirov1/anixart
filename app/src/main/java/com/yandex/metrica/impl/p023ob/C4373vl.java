package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vl */
/* loaded from: classes2.dex */
class C4373vl extends AbstractC3801Zk<C3854bm> {
    public C4373vl(@Nullable C3854bm c3854bm) {
        this(c3854bm, new C3726Wk(102400, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3801Zk
    /* renamed from: a */
    public List mo18518a(@NonNull C3854bm c3854bm) {
        return c3854bm.f44848h;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3801Zk
    /* renamed from: b */
    public int mo18519b(@NonNull C3854bm c3854bm) {
        return c3854bm.f44841a;
    }

    @VisibleForTesting
    public C4373vl(@Nullable C3854bm c3854bm, @NonNull C3726Wk c3726Wk) {
        super(c3854bm, c3726Wk);
    }
}
