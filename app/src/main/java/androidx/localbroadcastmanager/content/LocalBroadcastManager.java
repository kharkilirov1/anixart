package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class LocalBroadcastManager {

    /* renamed from: f */
    public static final Object f4757f = new Object();

    /* renamed from: g */
    public static LocalBroadcastManager f4758g;

    /* renamed from: a */
    public final Context f4759a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> f4760b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<ReceiverRecord>> f4761c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<BroadcastRecord> f4762d = new ArrayList<>();

    /* renamed from: e */
    public final Handler f4763e;

    public static final class BroadcastRecord {

        /* renamed from: a */
        public final Intent f4765a;

        /* renamed from: b */
        public final ArrayList<ReceiverRecord> f4766b;

        public BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.f4765a = intent;
            this.f4766b = arrayList;
        }
    }

    public static final class ReceiverRecord {

        /* renamed from: a */
        public final IntentFilter f4767a;

        /* renamed from: b */
        public final BroadcastReceiver f4768b;

        /* renamed from: c */
        public boolean f4769c;

        /* renamed from: d */
        public boolean f4770d;

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f4768b);
            sb.append(" filter=");
            sb.append(this.f4767a);
            if (this.f4770d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public LocalBroadcastManager(Context context) {
        this.f4759a = context;
        this.f4763e = new Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int size;
                BroadcastRecord[] broadcastRecordArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.this;
                while (true) {
                    synchronized (localBroadcastManager.f4760b) {
                        size = localBroadcastManager.f4762d.size();
                        if (size <= 0) {
                            return;
                        }
                        broadcastRecordArr = new BroadcastRecord[size];
                        localBroadcastManager.f4762d.toArray(broadcastRecordArr);
                        localBroadcastManager.f4762d.clear();
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        BroadcastRecord broadcastRecord = broadcastRecordArr[i2];
                        int size2 = broadcastRecord.f4766b.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ReceiverRecord receiverRecord = broadcastRecord.f4766b.get(i3);
                            if (!receiverRecord.f4770d) {
                                receiverRecord.f4768b.onReceive(localBroadcastManager.f4759a, broadcastRecord.f4765a);
                            }
                        }
                    }
                }
            }
        };
    }

    @NonNull
    /* renamed from: a */
    public static LocalBroadcastManager m3279a(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (f4757f) {
            if (f4758g == null) {
                f4758g = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = f4758g;
        }
        return localBroadcastManager;
    }

    /* renamed from: b */
    public boolean m3280b(@NonNull Intent intent) {
        boolean z;
        int i2;
        String str;
        ArrayList arrayList;
        ArrayList<ReceiverRecord> arrayList2;
        String str2;
        synchronized (this.f4760b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f4759a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = (intent.getFlags() & 8) != 0;
            if (z2) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<ReceiverRecord> arrayList3 = this.f4761c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z2) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i3 = 0;
                while (i3 < arrayList3.size()) {
                    ReceiverRecord receiverRecord = arrayList3.get(i3);
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + receiverRecord.f4767a);
                    }
                    if (receiverRecord.f4769c) {
                        if (z2) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i2 = i3;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i2 = i3;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = receiverRecord.f4767a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(receiverRecord);
                            receiverRecord.f4769c = true;
                            i3 = i2 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z2) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i2 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                z = false;
                if (arrayList5 != null) {
                    for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                        ((ReceiverRecord) arrayList5.get(i4)).f4769c = false;
                    }
                    this.f4762d.add(new BroadcastRecord(intent, arrayList5));
                    if (!this.f4763e.hasMessages(1)) {
                        this.f4763e.sendEmptyMessage(1);
                    }
                    return true;
                }
            } else {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: c */
    public void m3281c(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f4760b) {
            ArrayList<ReceiverRecord> remove = this.f4760b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                ReceiverRecord receiverRecord = remove.get(size);
                receiverRecord.f4770d = true;
                for (int i2 = 0; i2 < receiverRecord.f4767a.countActions(); i2++) {
                    String action = receiverRecord.f4767a.getAction(i2);
                    ArrayList<ReceiverRecord> arrayList = this.f4761c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            ReceiverRecord receiverRecord2 = arrayList.get(size2);
                            if (receiverRecord2.f4768b == broadcastReceiver) {
                                receiverRecord2.f4770d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f4761c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
