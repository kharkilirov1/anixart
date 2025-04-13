package io.grpc.internal;

import io.grpc.ConnectivityState;
import java.util.ArrayList;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes3.dex */
final class ConnectivityStateManager {

    /* renamed from: a */
    public ArrayList<Listener> f58531a = new ArrayList<>();

    /* renamed from: b */
    public volatile ConnectivityState f58532b = ConnectivityState.IDLE;

    public static final class Listener {
    }
}
