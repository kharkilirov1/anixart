package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.metrica.impl.p023ob.C3330Gn;
import com.yandex.metrica.impl.p023ob.C3379Im;
import com.yandex.metrica.impl.p023ob.C3505Nn;
import com.yandex.metrica.impl.p023ob.C4393wf;
import com.yandex.metrica.impl.p023ob.C4419xf;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String str) {
        return new BooleanAttribute(str, new C4393wf(), new C4419xf(new C3330Gn(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String str) {
        return new CounterAttribute(str, new C4393wf(), new C4419xf(new C3330Gn(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String str) {
        return new NumberAttribute(str, new C4393wf(), new C4419xf(new C3330Gn(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String str) {
        return new StringAttribute(str, new C3505Nn(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, C0000a.m16m("String attribute \"", str, "\""), C3379Im.m18338g()), new C4393wf(), new C4419xf(new C3330Gn(100)));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
