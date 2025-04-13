package com.yandex.metrica.impl.p023ob;

import androidx.annotation.RequiresApi;
import com.yandex.metrica.impl.p022ac.CrashpadServiceHelper;

@RequiresApi
/* renamed from: com.yandex.metrica.impl.ob.n8 */
/* loaded from: classes2.dex */
public class RunnableC4152n8 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        CrashpadServiceHelper.deleteCompletedReports();
    }
}
