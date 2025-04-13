package androidx.core.telephony;

import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
public class SubscriptionManagerCompat {

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1998a(int i2) {
            return SubscriptionManager.getSlotIndex(i2);
        }
    }
}
