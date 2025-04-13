package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.d5 */
/* loaded from: classes2.dex */
public class C3889d5 extends AbstractC3941f5<AbstractC4279s5> {

    /* renamed from: a */
    private final C3761Y5 f44907a;

    /* renamed from: b */
    private final Map<EnumC4067k1, AbstractC3586R5<AbstractC4279s5>> f44908b;

    /* renamed from: c */
    @Nullable
    private C3487N5 f44909c;

    public C3889d5(C3940f4 c3940f4) {
        C3761Y5 c3761y5 = new C3761Y5(c3940f4);
        this.f44907a = c3761y5;
        this.f44909c = new C3487N5(c3761y5);
        this.f44908b = m19708a();
    }

    /* renamed from: a */
    private HashMap<EnumC4067k1, AbstractC3586R5<AbstractC4279s5>> m19708a() {
        HashMap<EnumC4067k1, AbstractC3586R5<AbstractC4279s5>> hashMap = new HashMap<>();
        hashMap.put(EnumC4067k1.EVENT_TYPE_ACTIVATION, new C3462M5(this.f44907a));
        hashMap.put(EnumC4067k1.EVENT_TYPE_START, new C3838b6(this.f44907a));
        hashMap.put(EnumC4067k1.EVENT_TYPE_REGULAR, new C3686V5(this.f44907a));
        C3636T5 c3636t5 = new C3636T5(this.f44907a);
        hashMap.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_USER, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_SEND_REFERRER, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_STATBOX, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_CUSTOM_EVENT, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_APP_OPEN, new C3736X5(this.f44907a));
        hashMap.put(EnumC4067k1.EVENT_TYPE_PURGE_BUFFER, new C3661U5(this.f44907a));
        EnumC4067k1 enumC4067k1 = EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        C3761Y5 c3761y5 = this.f44907a;
        hashMap.put(enumC4067k1, new C3812a6(c3761y5, c3761y5.m19432l()));
        EnumC4067k1 enumC4067k12 = EnumC4067k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        C3761Y5 c3761y52 = this.f44907a;
        hashMap.put(enumC4067k12, new C3812a6(c3761y52, c3761y52.m19432l()));
        hashMap.put(EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new C3562Q5(this.f44907a));
        hashMap.put(EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C3562Q5(this.f44907a));
        hashMap.put(EnumC4067k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, new C3537P5(this.f44907a));
        EnumC4067k1 enumC4067k13 = EnumC4067k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        C3761Y5 c3761y53 = this.f44907a;
        hashMap.put(enumC4067k13, new C3812a6(c3761y53, c3761y53.m19432l()));
        hashMap.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C3890d6(this.f44907a));
        C3864c6 c3864c6 = new C3864c6(this.f44907a);
        hashMap.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED, c3864c6);
        hashMap.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, c3864c6);
        hashMap.put(EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, c3864c6);
        hashMap.put(EnumC4067k1.EVENT_TYPE_ANR, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_IDENTITY, new C3611S5(this.f44907a));
        hashMap.put(EnumC4067k1.EVENT_TYPE_SET_USER_INFO, new C3786Z5(this.f44907a));
        EnumC4067k1 enumC4067k14 = EnumC4067k1.EVENT_TYPE_REPORT_USER_INFO;
        C3761Y5 c3761y54 = this.f44907a;
        hashMap.put(enumC4067k14, new C3812a6(c3761y54, c3761y54.m19435o()));
        EnumC4067k1 enumC4067k15 = EnumC4067k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C3761Y5 c3761y55 = this.f44907a;
        hashMap.put(enumC4067k15, new C3812a6(c3761y55, c3761y55.m19424d()));
        EnumC4067k1 enumC4067k16 = EnumC4067k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C3761Y5 c3761y56 = this.f44907a;
        hashMap.put(enumC4067k16, new C3812a6(c3761y56, c3761y56.m19423c()));
        hashMap.put(EnumC4067k1.EVENT_TYPE_SEND_USER_PROFILE, c3636t5);
        EnumC4067k1 enumC4067k17 = EnumC4067k1.EVENT_TYPE_SET_USER_PROFILE_ID;
        C3761Y5 c3761y57 = this.f44907a;
        hashMap.put(enumC4067k17, new C3812a6(c3761y57, c3761y57.m19443w()));
        hashMap.put(EnumC4067k1.EVENT_TYPE_SEND_REVENUE_EVENT, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_IDENTITY_LIGHT, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_CLEANUP, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_VIEW_TREE, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_RAW_VIEW_TREE, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_STATBOX_EXP, c3636t5);
        hashMap.put(EnumC4067k1.EVENT_TYPE_WEBVIEW_SYNC, c3636t5);
        return hashMap;
    }

    /* renamed from: b */
    public C3761Y5 m19710b() {
        return this.f44907a;
    }

    /* renamed from: a */
    public void m19709a(EnumC4067k1 enumC4067k1, AbstractC3586R5<AbstractC4279s5> abstractC3586R5) {
        this.f44908b.put(enumC4067k1, abstractC3586R5);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3941f5
    /* renamed from: a */
    public C3863c5 mo19647a(int i2) {
        LinkedList linkedList = new LinkedList();
        EnumC4067k1 m20216a = EnumC4067k1.m20216a(i2);
        C3487N5 c3487n5 = this.f44909c;
        if (c3487n5 != null) {
            c3487n5.m18605a(m20216a, linkedList);
        }
        AbstractC3586R5<AbstractC4279s5> abstractC3586R5 = this.f44908b.get(m20216a);
        if (abstractC3586R5 != null) {
            abstractC3586R5.mo18570a(linkedList);
        }
        return new C3863c5(linkedList);
    }
}
