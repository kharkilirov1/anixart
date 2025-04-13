package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ll */
/* loaded from: classes2.dex */
class C3453Ll extends AbstractC3801Zk<C3428Kl> {
    public C3453Ll(@Nullable C3428Kl c3428Kl) {
        this(c3428Kl, new C3726Wk(102400, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3801Zk
    /* renamed from: a */
    public List mo18518a(@NonNull C3428Kl c3428Kl) {
        return c3428Kl.f43300p;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3801Zk
    /* renamed from: b */
    public int mo18519b(@NonNull C3428Kl c3428Kl) {
        return c3428Kl.f43295k;
    }

    @VisibleForTesting
    public C3453Ll(@Nullable C3428Kl c3428Kl, @NonNull C3726Wk c3726Wk) {
        super(c3428Kl, c3726Wk);
    }
}
