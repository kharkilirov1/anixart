package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.HandlerWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class SystemHandlerWrapper implements HandlerWrapper {

    /* renamed from: b */
    @GuardedBy
    public static final List<SystemMessage> f14725b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f14726a;

    public static final class SystemMessage implements HandlerWrapper.Message {

        /* renamed from: a */
        @Nullable
        public Message f14727a;

        public SystemMessage() {
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        /* renamed from: a */
        public void mo7577a() {
            Message message = this.f14727a;
            Objects.requireNonNull(message);
            message.sendToTarget();
            m7684b();
        }

        /* renamed from: b */
        public final void m7684b() {
            this.f14727a = null;
            List<SystemMessage> list = SystemHandlerWrapper.f14725b;
            synchronized (list) {
                if (((ArrayList) list).size() < 50) {
                    ((ArrayList) list).add(this);
                }
            }
        }

        public SystemMessage(C11751 c11751) {
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.f14726a = handler;
    }

    /* renamed from: l */
    public static SystemMessage m7683l() {
        SystemMessage systemMessage;
        List<SystemMessage> list = f14725b;
        synchronized (list) {
            if (((ArrayList) list).isEmpty()) {
                systemMessage = new SystemMessage(null);
            } else {
                systemMessage = (SystemMessage) ((ArrayList) list).remove(((ArrayList) list).size() - 1);
            }
        }
        return systemMessage;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: a */
    public HandlerWrapper.Message mo7566a(int i2, int i3, int i4) {
        SystemMessage m7683l = m7683l();
        m7683l.f14727a = this.f14726a.obtainMessage(i2, i3, i4);
        return m7683l;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: b */
    public boolean mo7567b(Runnable runnable) {
        return this.f14726a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: c */
    public HandlerWrapper.Message mo7568c(int i2) {
        SystemMessage m7683l = m7683l();
        m7683l.f14727a = this.f14726a.obtainMessage(i2);
        return m7683l;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: d */
    public boolean mo7569d(HandlerWrapper.Message message) {
        SystemMessage systemMessage = (SystemMessage) message;
        Handler handler = this.f14726a;
        Message message2 = systemMessage.f14727a;
        Objects.requireNonNull(message2);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message2);
        systemMessage.m7684b();
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: e */
    public boolean mo7570e(int i2) {
        return this.f14726a.hasMessages(i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: f */
    public boolean mo7571f(int i2) {
        return this.f14726a.sendEmptyMessage(i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: g */
    public HandlerWrapper.Message mo7572g(int i2, int i3, int i4, @Nullable Object obj) {
        SystemMessage m7683l = m7683l();
        m7683l.f14727a = this.f14726a.obtainMessage(i2, i3, i4, obj);
        return m7683l;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: h */
    public boolean mo7573h(int i2, long j2) {
        return this.f14726a.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: i */
    public void mo7574i(int i2) {
        this.f14726a.removeMessages(i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: j */
    public HandlerWrapper.Message mo7575j(int i2, @Nullable Object obj) {
        SystemMessage m7683l = m7683l();
        m7683l.f14727a = this.f14726a.obtainMessage(i2, obj);
        return m7683l;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    /* renamed from: k */
    public void mo7576k(@Nullable Object obj) {
        this.f14726a.removeCallbacksAndMessages(null);
    }
}
