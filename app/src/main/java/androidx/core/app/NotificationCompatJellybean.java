package androidx.core.app;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

@RequiresApi
/* loaded from: classes.dex */
class NotificationCompatJellybean {

    /* renamed from: a */
    public static final Object f3228a = new Object();

    /* renamed from: a */
    public static Bundle[] m1622a(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i2 = 0; i2 < remoteInputArr.length; i2++) {
            RemoteInput remoteInput = remoteInputArr[i2];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", remoteInput.f3269a);
            bundle.putCharSequence("label", remoteInput.f3270b);
            bundle.putCharSequenceArray("choices", remoteInput.f3271c);
            bundle.putBoolean("allowFreeFormInput", remoteInput.f3272d);
            bundle.putBundle("extras", remoteInput.f3274f);
            Set<String> set = remoteInput.f3275g;
            if (set != null && !set.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i2] = bundle;
        }
        return bundleArr;
    }
}
