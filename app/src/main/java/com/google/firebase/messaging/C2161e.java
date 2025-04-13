package com.google.firebase.messaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2161e implements OnSuccessListener, SuccessContinuation, Continuation {

    /* renamed from: b */
    public final /* synthetic */ Object f23382b;

    public /* synthetic */ C2161e(Object obj) {
        this.f23382b = obj;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    /* renamed from: a */
    public Task mo7910a(Object obj) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        String str = (String) this.f23382b;
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        Store store = FirebaseMessaging.f23265o;
        Objects.requireNonNull(topicsSubscriber);
        TopicOperation topicOperation = new TopicOperation("S", str);
        TopicsStore topicsStore = topicsSubscriber.f23342h;
        synchronized (topicsStore) {
            topicsStore.f23331b.m12684a(topicOperation.f23328c);
        }
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (topicsSubscriber.f23339e) {
            String str2 = topicOperation.f23328c;
            if (topicsSubscriber.f23339e.containsKey(str2)) {
                arrayDeque = topicsSubscriber.f23339e.get(str2);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                topicsSubscriber.f23339e.put(str2, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
        zzw<Void> zzwVar = taskCompletionSource.f17240a;
        topicsSubscriber.m12698f();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public Object mo7340e(Task task) {
        Objects.requireNonNull((GmsRpc) this.f23382b);
        Bundle bundle = (Bundle) task.mo9709n(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        if (((FirebaseMessaging) this.f23382b).f23274g.m12655b()) {
            topicsSubscriber.m12698f();
        }
    }
}
