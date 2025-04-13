package com.google.firebase.messaging;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2163g implements RequestDeduplicator.GetTokenRequest, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ FirebaseMessaging f23384b;

    /* renamed from: c */
    public final /* synthetic */ String f23385c;

    /* renamed from: d */
    public final /* synthetic */ Store.Token f23386d;

    public /* synthetic */ C2163g(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f23384b = firebaseMessaging;
        this.f23385c = str;
        this.f23386d = token;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    /* renamed from: a */
    public Task mo7910a(Object obj) {
        FirebaseMessaging firebaseMessaging = this.f23384b;
        String str = this.f23385c;
        Store.Token token = this.f23386d;
        String str2 = (String) obj;
        Store m12644c = FirebaseMessaging.m12644c(firebaseMessaging.f23271d);
        String m12647d = firebaseMessaging.m12647d();
        String m12666a = firebaseMessaging.f23279l.m12666a();
        synchronized (m12644c) {
            String m12686a = Store.Token.m12686a(str2, m12666a, System.currentTimeMillis());
            if (m12686a != null) {
                SharedPreferences.Editor edit = m12644c.f23316a.edit();
                edit.putString(m12644c.m12685a(m12647d, str), m12686a);
                edit.commit();
            }
        }
        if (token == null || !str2.equals(token.f23318a)) {
            firebaseMessaging.m12649f(str2);
        }
        return Tasks.m9723e(str2);
    }
}
