package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.IMultiInstanceInvalidationService;
import java.util.HashMap;

@ExperimentalRoomApi
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: b */
    public int f5823b = 0;

    /* renamed from: c */
    public final HashMap<Integer, String> f5824c = new HashMap<>();

    /* renamed from: d */
    public final RemoteCallbackList<IMultiInstanceInvalidationCallback> f5825d = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService.1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, Object obj) {
            MultiInstanceInvalidationService.this.f5824c.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    };

    /* renamed from: e */
    public final IMultiInstanceInvalidationService.Stub f5826e = new BinderC05532();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$2 */
    public class BinderC05532 extends IMultiInstanceInvalidationService.Stub {
        public BinderC05532() {
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        /* renamed from: q2 */
        public void mo4056q2(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f5825d) {
                String str = MultiInstanceInvalidationService.this.f5824c.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f5825d.beginBroadcast();
                for (int i3 = 0; i3 < beginBroadcast; i3++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f5825d.getBroadcastCookie(i3)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f5824c.get(Integer.valueOf(intValue));
                        if (i2 != intValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.f5825d.getBroadcastItem(i3).mo4054b0(strArr);
                            } catch (RemoteException e2) {
                                Log.w("ROOM", "Error invoking a remote callback", e2);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f5825d.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        /* renamed from: s0 */
        public int mo4057s0(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f5825d) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.f5823b + 1;
                multiInstanceInvalidationService.f5823b = i2;
                if (multiInstanceInvalidationService.f5825d.register(iMultiInstanceInvalidationCallback, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f5824c.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f5823b--;
                return 0;
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        /* renamed from: z2 */
        public void mo4058z2(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f5825d) {
                MultiInstanceInvalidationService.this.f5825d.unregister(iMultiInstanceInvalidationCallback);
                MultiInstanceInvalidationService.this.f5824c.remove(Integer.valueOf(i2));
            }
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return this.f5826e;
    }
}
