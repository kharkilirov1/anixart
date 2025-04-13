package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public Random f242a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f243b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f244c = new HashMap();

    /* renamed from: d */
    public final Map<String, LifecycleContainer> f245d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f246e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, CallbackAndContract<?>> f247f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f248g = new HashMap();

    /* renamed from: h */
    public final Bundle f249h = new Bundle();

    public static class CallbackAndContract<O> {

        /* renamed from: a */
        public final ActivityResultCallback<O> f260a;

        /* renamed from: b */
        public final ActivityResultContract<?, O> f261b;

        public CallbackAndContract(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            this.f260a = activityResultCallback;
            this.f261b = activityResultContract;
        }
    }

    public static class LifecycleContainer {

        /* renamed from: a */
        public final Lifecycle f262a;

        /* renamed from: b */
        public final ArrayList<LifecycleEventObserver> f263b = new ArrayList<>();

        public LifecycleContainer(@NonNull Lifecycle lifecycle) {
            this.f262a = lifecycle;
        }
    }

    @MainThread
    /* renamed from: a */
    public final boolean m319a(int i2, int i3, @Nullable Intent intent) {
        String str = this.f243b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.f247f.get(str);
        if (callbackAndContract == null || callbackAndContract.f260a == null || !this.f246e.contains(str)) {
            this.f248g.remove(str);
            this.f249h.putParcelable(str, new ActivityResult(i3, intent));
            return true;
        }
        callbackAndContract.f260a.mo314a(callbackAndContract.f261b.mo318c(i3, intent));
        this.f246e.remove(str);
        return true;
    }

    @MainThread
    /* renamed from: b */
    public final <O> boolean m320b(int i2, @SuppressLint O o) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.f243b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.f247f.get(str);
        if (callbackAndContract == null || (activityResultCallback = callbackAndContract.f260a) == null) {
            this.f249h.remove(str);
            this.f248g.put(str, o);
            return true;
        }
        if (!this.f246e.remove(str)) {
            return true;
        }
        activityResultCallback.mo314a(o);
        return true;
    }

    @MainThread
    /* renamed from: c */
    public abstract <I, O> void mo303c(int i2, @NonNull ActivityResultContract<I, O> activityResultContract, @SuppressLint I i3, @Nullable ActivityOptionsCompat activityOptionsCompat);

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: d */
    public final <I, O> ActivityResultLauncher<I> m321d(@NonNull final String str, @NonNull final ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        m323f(str);
        this.f247f.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (this.f248g.containsKey(str)) {
            Object obj = this.f248g.get(str);
            this.f248g.remove(str);
            activityResultCallback.mo314a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f249h.getParcelable(str);
        if (activityResult != null) {
            this.f249h.remove(str);
            activityResultCallback.mo314a(activityResultContract.mo318c(activityResult.f239b, activityResult.f240c));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.3
            @Override // androidx.activity.result.ActivityResultLauncher
            /* renamed from: a */
            public void mo315a(I i2, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                Integer num = ActivityResultRegistry.this.f244c.get(str);
                if (num != null) {
                    ActivityResultRegistry.this.f246e.add(str);
                    try {
                        ActivityResultRegistry.this.mo303c(num.intValue(), activityResultContract, i2, activityOptionsCompat);
                        return;
                    } catch (Exception e2) {
                        ActivityResultRegistry.this.f246e.remove(str);
                        throw e2;
                    }
                }
                StringBuilder m24u = C0000a.m24u("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                m24u.append(activityResultContract);
                m24u.append(" and input ");
                m24u.append(i2);
                m24u.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(m24u.toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            /* renamed from: b */
            public void mo316b() {
                ActivityResultRegistry.this.m324g(str);
            }
        };
    }

    @NonNull
    /* renamed from: e */
    public final <I, O> ActivityResultLauncher<I> m322e(@NonNull final String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull final ActivityResultContract<I, O> activityResultContract, @NonNull final ActivityResultCallback<O> activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.mo3188b().compareTo(Lifecycle.State.STARTED) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.mo3188b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m323f(str);
        LifecycleContainer lifecycleContainer = this.f245d.get(str);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* renamed from: c */
            public void mo304c(@NonNull LifecycleOwner lifecycleOwner2, @NonNull Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f247f.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.m324g(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f247f.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
                if (ActivityResultRegistry.this.f248g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f248g.get(str);
                    ActivityResultRegistry.this.f248g.remove(str);
                    activityResultCallback.mo314a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f249h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f249h.remove(str);
                    activityResultCallback.mo314a(activityResultContract.mo318c(activityResult.f239b, activityResult.f240c));
                }
            }
        };
        lifecycleContainer.f262a.mo3187a(lifecycleEventObserver);
        lifecycleContainer.f263b.add(lifecycleEventObserver);
        this.f245d.put(str, lifecycleContainer);
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.2
            @Override // androidx.activity.result.ActivityResultLauncher
            /* renamed from: a */
            public void mo315a(I i2, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                Integer num = ActivityResultRegistry.this.f244c.get(str);
                if (num != null) {
                    ActivityResultRegistry.this.f246e.add(str);
                    try {
                        ActivityResultRegistry.this.mo303c(num.intValue(), activityResultContract, i2, activityOptionsCompat);
                        return;
                    } catch (Exception e2) {
                        ActivityResultRegistry.this.f246e.remove(str);
                        throw e2;
                    }
                }
                StringBuilder m24u = C0000a.m24u("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                m24u.append(activityResultContract);
                m24u.append(" and input ");
                m24u.append(i2);
                m24u.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(m24u.toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            /* renamed from: b */
            public void mo316b() {
                ActivityResultRegistry.this.m324g(str);
            }
        };
    }

    /* renamed from: f */
    public final void m323f(String str) {
        if (this.f244c.get(str) != null) {
            return;
        }
        int nextInt = this.f242a.nextInt(2147418112);
        while (true) {
            int i2 = nextInt + TextBuffer.MAX_SEGMENT_LEN;
            if (!this.f243b.containsKey(Integer.valueOf(i2))) {
                this.f243b.put(Integer.valueOf(i2), str);
                this.f244c.put(str, Integer.valueOf(i2));
                return;
            }
            nextInt = this.f242a.nextInt(2147418112);
        }
    }

    @MainThread
    /* renamed from: g */
    public final void m324g(@NonNull String str) {
        Integer remove;
        if (!this.f246e.contains(str) && (remove = this.f244c.remove(str)) != null) {
            this.f243b.remove(remove);
        }
        this.f247f.remove(str);
        if (this.f248g.containsKey(str)) {
            StringBuilder m28y = C0000a.m28y("Dropping pending result for request ", str, ": ");
            m28y.append(this.f248g.get(str));
            Log.w("ActivityResultRegistry", m28y.toString());
            this.f248g.remove(str);
        }
        if (this.f249h.containsKey(str)) {
            StringBuilder m28y2 = C0000a.m28y("Dropping pending result for request ", str, ": ");
            m28y2.append(this.f249h.getParcelable(str));
            Log.w("ActivityResultRegistry", m28y2.toString());
            this.f249h.remove(str);
        }
        LifecycleContainer lifecycleContainer = this.f245d.get(str);
        if (lifecycleContainer != null) {
            Iterator<LifecycleEventObserver> it = lifecycleContainer.f263b.iterator();
            while (it.hasNext()) {
                lifecycleContainer.f262a.mo3189c(it.next());
            }
            lifecycleContainer.f263b.clear();
            this.f245d.remove(str);
        }
    }
}
