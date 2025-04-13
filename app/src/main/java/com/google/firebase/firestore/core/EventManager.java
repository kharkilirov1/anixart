package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.SyncEngine;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class EventManager implements SyncEngine.SyncEngineCallback {

    public static class ListenOptions {
    }

    public static class QueryListenersInfo {

        /* renamed from: a */
        public final List<QueryListener> f22694a = new ArrayList();
    }
}
