package io.grpc.android;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.google.common.annotations.VisibleForTesting;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ForwardingChannelBuilder;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.MethodDescriptor;
import io.grpc.internal.SharedResourceHolder;
import io.grpc.okhttp.OkHttpChannelBuilder;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class AndroidChannelBuilder extends ForwardingChannelBuilder<AndroidChannelBuilder> {

    @VisibleForTesting
    public static final class AndroidChannel extends ManagedChannel {

        /* renamed from: io.grpc.android.AndroidChannelBuilder$AndroidChannel$1 */
        class RunnableC63181 implements Runnable {
            @Override // java.lang.Runnable
            @TargetApi
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: io.grpc.android.AndroidChannelBuilder$AndroidChannel$2 */
        class RunnableC63192 implements Runnable {
            @Override // java.lang.Runnable
            @TargetApi
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        @TargetApi
        public class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z) {
                if (z) {
                    return;
                }
                Objects.requireNonNull(null);
                throw null;
            }
        }

        public class NetworkReceiver extends BroadcastReceiver {

            /* renamed from: a */
            public boolean f58339a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z = this.f58339a;
                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f58339a = z2;
                if (!z2 || z) {
                    return;
                }
                Objects.requireNonNull(null);
                throw null;
            }
        }

        @Override // io.grpc.Channel
        /* renamed from: d */
        public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> mo30809d(MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions) {
            throw null;
        }
    }

    static {
        try {
            SharedResourceHolder.Resource<Executor> resource = OkHttpChannelBuilder.f59200d;
        } catch (ClassNotFoundException unused) {
        }
    }

    @Override // io.grpc.ForwardingChannelBuilder
    /* renamed from: a */
    public ManagedChannelBuilder<?> mo30859a() {
        return null;
    }
}
