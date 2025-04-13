package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {

    /* renamed from: n */
    public static final ImmutableList<Long> f14390n = ImmutableList.m11629F(5400000L, 3300000L, 2000000L, 1300000L, 760000L);

    /* renamed from: o */
    public static final ImmutableList<Long> f14391o = ImmutableList.m11629F(1700000L, 820000L, 450000L, 180000L, 130000L);

    /* renamed from: p */
    public static final ImmutableList<Long> f14392p = ImmutableList.m11629F(2300000L, 1300000L, 1000000L, 820000L, 570000L);

    /* renamed from: q */
    public static final ImmutableList<Long> f14393q = ImmutableList.m11629F(3400000L, 2000000L, 1400000L, 1000000L, 620000L);

    /* renamed from: r */
    public static final ImmutableList<Long> f14394r = ImmutableList.m11629F(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);

    /* renamed from: s */
    public static final ImmutableList<Long> f14395s = ImmutableList.m11629F(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);

    /* renamed from: t */
    @Nullable
    public static DefaultBandwidthMeter f14396t;

    /* renamed from: a */
    public final ImmutableMap<Integer, Long> f14397a;

    /* renamed from: b */
    public final BandwidthMeter.EventListener.EventDispatcher f14398b;

    /* renamed from: c */
    public final SlidingPercentile f14399c;

    /* renamed from: d */
    public final Clock f14400d;

    /* renamed from: e */
    public final boolean f14401e;

    /* renamed from: f */
    public int f14402f;

    /* renamed from: g */
    public long f14403g;

    /* renamed from: h */
    public long f14404h;

    /* renamed from: i */
    public int f14405i;

    /* renamed from: j */
    public long f14406j;

    /* renamed from: k */
    public long f14407k;

    /* renamed from: l */
    public long f14408l;

    /* renamed from: m */
    public long f14409m;

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        public final Context f14410a;

        /* renamed from: b */
        public Map<Integer, Long> f14411b;

        /* renamed from: c */
        public int f14412c;

        /* renamed from: d */
        public Clock f14413d;

        /* renamed from: e */
        public boolean f14414e;

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0287  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x02a3  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x02b1  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x02cd  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x02db  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x02e9  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0305  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0321  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x033d  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x034b  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x0359  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0367  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0375  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x0383  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0391  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x039f  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x03ad  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x03c9  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x03d7  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x03e5  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x03f3  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0401  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x040f  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x041d  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x042b  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x0439  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0447  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x0455  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0463  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x0471  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x047f  */
        /* JADX WARN: Removed duplicated region for block: B:244:0x048d  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x049b  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x04a9  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x04b7  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x04c5  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x04d3  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x04e1  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x04ef  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x04fd  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x050b  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x0519  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x0527  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x0535  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x0543  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x0551  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x055f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:292:0x056d  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x057b  */
        /* JADX WARN: Removed duplicated region for block: B:298:0x0589  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x0597  */
        /* JADX WARN: Removed duplicated region for block: B:304:0x05a5  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x05b3  */
        /* JADX WARN: Removed duplicated region for block: B:310:0x05c1  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x05cf  */
        /* JADX WARN: Removed duplicated region for block: B:316:0x05dd  */
        /* JADX WARN: Removed duplicated region for block: B:319:0x05eb  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:322:0x05f9  */
        /* JADX WARN: Removed duplicated region for block: B:325:0x0607  */
        /* JADX WARN: Removed duplicated region for block: B:328:0x0615  */
        /* JADX WARN: Removed duplicated region for block: B:331:0x0623  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x0631  */
        /* JADX WARN: Removed duplicated region for block: B:337:0x063f  */
        /* JADX WARN: Removed duplicated region for block: B:340:0x064d  */
        /* JADX WARN: Removed duplicated region for block: B:343:0x065b  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x0669  */
        /* JADX WARN: Removed duplicated region for block: B:349:0x0677  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x0685  */
        /* JADX WARN: Removed duplicated region for block: B:355:0x0693  */
        /* JADX WARN: Removed duplicated region for block: B:358:0x06a1  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x06af  */
        /* JADX WARN: Removed duplicated region for block: B:364:0x06bd  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x06cb  */
        /* JADX WARN: Removed duplicated region for block: B:370:0x06d9  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x06e7  */
        /* JADX WARN: Removed duplicated region for block: B:376:0x06f5  */
        /* JADX WARN: Removed duplicated region for block: B:379:0x0703  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x0711  */
        /* JADX WARN: Removed duplicated region for block: B:385:0x071f  */
        /* JADX WARN: Removed duplicated region for block: B:388:0x072d  */
        /* JADX WARN: Removed duplicated region for block: B:391:0x073b  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x0749  */
        /* JADX WARN: Removed duplicated region for block: B:397:0x0757  */
        /* JADX WARN: Removed duplicated region for block: B:400:0x0765  */
        /* JADX WARN: Removed duplicated region for block: B:403:0x0773  */
        /* JADX WARN: Removed duplicated region for block: B:406:0x0781  */
        /* JADX WARN: Removed duplicated region for block: B:409:0x078f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:412:0x079d  */
        /* JADX WARN: Removed duplicated region for block: B:415:0x07ab  */
        /* JADX WARN: Removed duplicated region for block: B:418:0x07b9  */
        /* JADX WARN: Removed duplicated region for block: B:421:0x07c7  */
        /* JADX WARN: Removed duplicated region for block: B:424:0x07d5  */
        /* JADX WARN: Removed duplicated region for block: B:427:0x07e3  */
        /* JADX WARN: Removed duplicated region for block: B:430:0x07f1  */
        /* JADX WARN: Removed duplicated region for block: B:433:0x07ff  */
        /* JADX WARN: Removed duplicated region for block: B:436:0x080d  */
        /* JADX WARN: Removed duplicated region for block: B:439:0x081b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:442:0x0829  */
        /* JADX WARN: Removed duplicated region for block: B:445:0x0837  */
        /* JADX WARN: Removed duplicated region for block: B:448:0x0845  */
        /* JADX WARN: Removed duplicated region for block: B:451:0x0853  */
        /* JADX WARN: Removed duplicated region for block: B:454:0x0861  */
        /* JADX WARN: Removed duplicated region for block: B:457:0x086f  */
        /* JADX WARN: Removed duplicated region for block: B:460:0x087d  */
        /* JADX WARN: Removed duplicated region for block: B:463:0x088b  */
        /* JADX WARN: Removed duplicated region for block: B:466:0x0899  */
        /* JADX WARN: Removed duplicated region for block: B:469:0x08a7  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:472:0x08b5  */
        /* JADX WARN: Removed duplicated region for block: B:475:0x08c3  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x08d1  */
        /* JADX WARN: Removed duplicated region for block: B:481:0x08df  */
        /* JADX WARN: Removed duplicated region for block: B:484:0x08ed  */
        /* JADX WARN: Removed duplicated region for block: B:487:0x08fb  */
        /* JADX WARN: Removed duplicated region for block: B:490:0x0909  */
        /* JADX WARN: Removed duplicated region for block: B:493:0x0917  */
        /* JADX WARN: Removed duplicated region for block: B:496:0x0925  */
        /* JADX WARN: Removed duplicated region for block: B:499:0x0933  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:502:0x0941  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x094f  */
        /* JADX WARN: Removed duplicated region for block: B:508:0x095d  */
        /* JADX WARN: Removed duplicated region for block: B:511:0x096b  */
        /* JADX WARN: Removed duplicated region for block: B:514:0x0979  */
        /* JADX WARN: Removed duplicated region for block: B:517:0x0987  */
        /* JADX WARN: Removed duplicated region for block: B:520:0x0995  */
        /* JADX WARN: Removed duplicated region for block: B:523:0x09a3  */
        /* JADX WARN: Removed duplicated region for block: B:526:0x09b1  */
        /* JADX WARN: Removed duplicated region for block: B:529:0x09bf  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:532:0x09cd  */
        /* JADX WARN: Removed duplicated region for block: B:535:0x09db  */
        /* JADX WARN: Removed duplicated region for block: B:538:0x09e9  */
        /* JADX WARN: Removed duplicated region for block: B:541:0x09f7  */
        /* JADX WARN: Removed duplicated region for block: B:544:0x0a05  */
        /* JADX WARN: Removed duplicated region for block: B:547:0x0a13  */
        /* JADX WARN: Removed duplicated region for block: B:550:0x0a21  */
        /* JADX WARN: Removed duplicated region for block: B:553:0x0a2f  */
        /* JADX WARN: Removed duplicated region for block: B:556:0x0a3d  */
        /* JADX WARN: Removed duplicated region for block: B:559:0x0a4b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:562:0x0a59  */
        /* JADX WARN: Removed duplicated region for block: B:565:0x0a67  */
        /* JADX WARN: Removed duplicated region for block: B:568:0x0a75  */
        /* JADX WARN: Removed duplicated region for block: B:571:0x0a83  */
        /* JADX WARN: Removed duplicated region for block: B:574:0x0a91  */
        /* JADX WARN: Removed duplicated region for block: B:577:0x0a9f  */
        /* JADX WARN: Removed duplicated region for block: B:580:0x0aad  */
        /* JADX WARN: Removed duplicated region for block: B:583:0x0abb  */
        /* JADX WARN: Removed duplicated region for block: B:586:0x0ac9  */
        /* JADX WARN: Removed duplicated region for block: B:589:0x0ad7  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:592:0x0ae5  */
        /* JADX WARN: Removed duplicated region for block: B:595:0x0af3  */
        /* JADX WARN: Removed duplicated region for block: B:598:0x0b01  */
        /* JADX WARN: Removed duplicated region for block: B:601:0x0b0f  */
        /* JADX WARN: Removed duplicated region for block: B:604:0x0b1d  */
        /* JADX WARN: Removed duplicated region for block: B:607:0x0b2b  */
        /* JADX WARN: Removed duplicated region for block: B:610:0x0b39  */
        /* JADX WARN: Removed duplicated region for block: B:613:0x0b47  */
        /* JADX WARN: Removed duplicated region for block: B:616:0x0b55  */
        /* JADX WARN: Removed duplicated region for block: B:619:0x0b63  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:622:0x0b71  */
        /* JADX WARN: Removed duplicated region for block: B:625:0x0b7f  */
        /* JADX WARN: Removed duplicated region for block: B:628:0x0b8d  */
        /* JADX WARN: Removed duplicated region for block: B:631:0x0b9b  */
        /* JADX WARN: Removed duplicated region for block: B:634:0x0ba9  */
        /* JADX WARN: Removed duplicated region for block: B:637:0x0bb7  */
        /* JADX WARN: Removed duplicated region for block: B:640:0x0bc5  */
        /* JADX WARN: Removed duplicated region for block: B:643:0x0bd3  */
        /* JADX WARN: Removed duplicated region for block: B:646:0x0be1  */
        /* JADX WARN: Removed duplicated region for block: B:649:0x0bef  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:652:0x0bfd  */
        /* JADX WARN: Removed duplicated region for block: B:655:0x0c0b  */
        /* JADX WARN: Removed duplicated region for block: B:658:0x0c19  */
        /* JADX WARN: Removed duplicated region for block: B:661:0x0c27  */
        /* JADX WARN: Removed duplicated region for block: B:664:0x0c35  */
        /* JADX WARN: Removed duplicated region for block: B:667:0x0c43  */
        /* JADX WARN: Removed duplicated region for block: B:670:0x0c51  */
        /* JADX WARN: Removed duplicated region for block: B:673:0x0c5f  */
        /* JADX WARN: Removed duplicated region for block: B:676:0x0c6d  */
        /* JADX WARN: Removed duplicated region for block: B:679:0x0c7b  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:682:0x0c89  */
        /* JADX WARN: Removed duplicated region for block: B:685:0x0c97  */
        /* JADX WARN: Removed duplicated region for block: B:688:0x0ca5  */
        /* JADX WARN: Removed duplicated region for block: B:691:0x0cb3  */
        /* JADX WARN: Removed duplicated region for block: B:694:0x0cc1  */
        /* JADX WARN: Removed duplicated region for block: B:697:0x0ccf  */
        /* JADX WARN: Removed duplicated region for block: B:700:0x0cdd  */
        /* JADX WARN: Removed duplicated region for block: B:703:0x0ceb  */
        /* JADX WARN: Removed duplicated region for block: B:706:0x0cf6  */
        /* JADX WARN: Removed duplicated region for block: B:709:0x0d01  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:712:0x0d0c  */
        /* JADX WARN: Removed duplicated region for block: B:715:0x0d17  */
        /* JADX WARN: Removed duplicated region for block: B:718:0x0d22  */
        /* JADX WARN: Removed duplicated region for block: B:721:0x0d2d  */
        /* JADX WARN: Removed duplicated region for block: B:724:0x0d38  */
        /* JADX WARN: Removed duplicated region for block: B:728:0x0d45  */
        /* JADX WARN: Removed duplicated region for block: B:732:0x0d4c  */
        /* JADX WARN: Removed duplicated region for block: B:733:0x0d53  */
        /* JADX WARN: Removed duplicated region for block: B:734:0x0d5a  */
        /* JADX WARN: Removed duplicated region for block: B:735:0x0d61  */
        /* JADX WARN: Removed duplicated region for block: B:736:0x0d68  */
        /* JADX WARN: Removed duplicated region for block: B:737:0x0d6f  */
        /* JADX WARN: Removed duplicated region for block: B:738:0x0d76  */
        /* JADX WARN: Removed duplicated region for block: B:739:0x0d7d  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:740:0x0d84  */
        /* JADX WARN: Removed duplicated region for block: B:741:0x0d8b  */
        /* JADX WARN: Removed duplicated region for block: B:742:0x0d92  */
        /* JADX WARN: Removed duplicated region for block: B:743:0x0d99  */
        /* JADX WARN: Removed duplicated region for block: B:744:0x0da0  */
        /* JADX WARN: Removed duplicated region for block: B:745:0x0da7  */
        /* JADX WARN: Removed duplicated region for block: B:746:0x0dae  */
        /* JADX WARN: Removed duplicated region for block: B:747:0x0db5  */
        /* JADX WARN: Removed duplicated region for block: B:748:0x0dbc  */
        /* JADX WARN: Removed duplicated region for block: B:749:0x0dc3  */
        /* JADX WARN: Removed duplicated region for block: B:750:0x0dca  */
        /* JADX WARN: Removed duplicated region for block: B:751:0x0dd1  */
        /* JADX WARN: Removed duplicated region for block: B:752:0x0dd8  */
        /* JADX WARN: Removed duplicated region for block: B:753:0x0ddf  */
        /* JADX WARN: Removed duplicated region for block: B:754:0x0de6  */
        /* JADX WARN: Removed duplicated region for block: B:755:0x0ded  */
        /* JADX WARN: Removed duplicated region for block: B:756:0x0df4  */
        /* JADX WARN: Removed duplicated region for block: B:757:0x0dfb  */
        /* JADX WARN: Removed duplicated region for block: B:758:0x0e02  */
        /* JADX WARN: Removed duplicated region for block: B:759:0x0e09  */
        /* JADX WARN: Removed duplicated region for block: B:760:0x0e10  */
        /* JADX WARN: Removed duplicated region for block: B:761:0x0e17  */
        /* JADX WARN: Removed duplicated region for block: B:762:0x0e1e  */
        /* JADX WARN: Removed duplicated region for block: B:763:0x0e25  */
        /* JADX WARN: Removed duplicated region for block: B:764:0x0e2c  */
        /* JADX WARN: Removed duplicated region for block: B:765:0x0e33  */
        /* JADX WARN: Removed duplicated region for block: B:766:0x0e3a  */
        /* JADX WARN: Removed duplicated region for block: B:767:0x0e41  */
        /* JADX WARN: Removed duplicated region for block: B:768:0x0e48  */
        /* JADX WARN: Removed duplicated region for block: B:769:0x0e4f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:770:0x0e56  */
        /* JADX WARN: Removed duplicated region for block: B:771:0x0e5d  */
        /* JADX WARN: Removed duplicated region for block: B:772:0x0e64  */
        /* JADX WARN: Removed duplicated region for block: B:773:0x0e6b  */
        /* JADX WARN: Removed duplicated region for block: B:774:0x0e72  */
        /* JADX WARN: Removed duplicated region for block: B:775:0x0e79  */
        /* JADX WARN: Removed duplicated region for block: B:776:0x0e80  */
        /* JADX WARN: Removed duplicated region for block: B:777:0x0e87  */
        /* JADX WARN: Removed duplicated region for block: B:778:0x0e8e  */
        /* JADX WARN: Removed duplicated region for block: B:779:0x0e95  */
        /* JADX WARN: Removed duplicated region for block: B:780:0x0e9c  */
        /* JADX WARN: Removed duplicated region for block: B:781:0x0ea3  */
        /* JADX WARN: Removed duplicated region for block: B:782:0x0eaa  */
        /* JADX WARN: Removed duplicated region for block: B:783:0x0eb1  */
        /* JADX WARN: Removed duplicated region for block: B:784:0x0eb8  */
        /* JADX WARN: Removed duplicated region for block: B:785:0x0ebf  */
        /* JADX WARN: Removed duplicated region for block: B:786:0x0ec6  */
        /* JADX WARN: Removed duplicated region for block: B:787:0x0ecd  */
        /* JADX WARN: Removed duplicated region for block: B:788:0x0ed4  */
        /* JADX WARN: Removed duplicated region for block: B:789:0x0edb  */
        /* JADX WARN: Removed duplicated region for block: B:790:0x0ee2  */
        /* JADX WARN: Removed duplicated region for block: B:791:0x0ee9  */
        /* JADX WARN: Removed duplicated region for block: B:792:0x0ef0  */
        /* JADX WARN: Removed duplicated region for block: B:793:0x0ef7  */
        /* JADX WARN: Removed duplicated region for block: B:794:0x0efe  */
        /* JADX WARN: Removed duplicated region for block: B:795:0x0f05  */
        /* JADX WARN: Removed duplicated region for block: B:796:0x0f0c  */
        /* JADX WARN: Removed duplicated region for block: B:797:0x0f13  */
        /* JADX WARN: Removed duplicated region for block: B:798:0x0f1a  */
        /* JADX WARN: Removed duplicated region for block: B:799:0x0f21  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:800:0x0f28  */
        /* JADX WARN: Removed duplicated region for block: B:801:0x0f2f  */
        /* JADX WARN: Removed duplicated region for block: B:802:0x0f36  */
        /* JADX WARN: Removed duplicated region for block: B:803:0x0f3d  */
        /* JADX WARN: Removed duplicated region for block: B:804:0x0f44  */
        /* JADX WARN: Removed duplicated region for block: B:805:0x0f4b  */
        /* JADX WARN: Removed duplicated region for block: B:806:0x0f52  */
        /* JADX WARN: Removed duplicated region for block: B:807:0x0f59  */
        /* JADX WARN: Removed duplicated region for block: B:808:0x0f60  */
        /* JADX WARN: Removed duplicated region for block: B:809:0x0f67  */
        /* JADX WARN: Removed duplicated region for block: B:810:0x0f6e  */
        /* JADX WARN: Removed duplicated region for block: B:811:0x0f75  */
        /* JADX WARN: Removed duplicated region for block: B:812:0x0f7c  */
        /* JADX WARN: Removed duplicated region for block: B:813:0x0f83  */
        /* JADX WARN: Removed duplicated region for block: B:814:0x0f8a  */
        /* JADX WARN: Removed duplicated region for block: B:815:0x0f91  */
        /* JADX WARN: Removed duplicated region for block: B:816:0x0f98  */
        /* JADX WARN: Removed duplicated region for block: B:817:0x0f9f  */
        /* JADX WARN: Removed duplicated region for block: B:818:0x0fa6  */
        /* JADX WARN: Removed duplicated region for block: B:819:0x0fad  */
        /* JADX WARN: Removed duplicated region for block: B:820:0x0fb4  */
        /* JADX WARN: Removed duplicated region for block: B:821:0x0fbb  */
        /* JADX WARN: Removed duplicated region for block: B:822:0x0fc2  */
        /* JADX WARN: Removed duplicated region for block: B:823:0x0fc9  */
        /* JADX WARN: Removed duplicated region for block: B:824:0x0fd0  */
        /* JADX WARN: Removed duplicated region for block: B:825:0x0fd7  */
        /* JADX WARN: Removed duplicated region for block: B:826:0x0fde  */
        /* JADX WARN: Removed duplicated region for block: B:827:0x0fe5  */
        /* JADX WARN: Removed duplicated region for block: B:828:0x0fec  */
        /* JADX WARN: Removed duplicated region for block: B:829:0x0ff3  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:830:0x0ffa  */
        /* JADX WARN: Removed duplicated region for block: B:831:0x1001  */
        /* JADX WARN: Removed duplicated region for block: B:832:0x1008  */
        /* JADX WARN: Removed duplicated region for block: B:833:0x100f  */
        /* JADX WARN: Removed duplicated region for block: B:834:0x1016  */
        /* JADX WARN: Removed duplicated region for block: B:835:0x101d  */
        /* JADX WARN: Removed duplicated region for block: B:836:0x1024  */
        /* JADX WARN: Removed duplicated region for block: B:837:0x102b  */
        /* JADX WARN: Removed duplicated region for block: B:838:0x1032  */
        /* JADX WARN: Removed duplicated region for block: B:839:0x1039  */
        /* JADX WARN: Removed duplicated region for block: B:840:0x1040  */
        /* JADX WARN: Removed duplicated region for block: B:841:0x1047  */
        /* JADX WARN: Removed duplicated region for block: B:842:0x104e  */
        /* JADX WARN: Removed duplicated region for block: B:843:0x1055  */
        /* JADX WARN: Removed duplicated region for block: B:844:0x105c  */
        /* JADX WARN: Removed duplicated region for block: B:845:0x1063  */
        /* JADX WARN: Removed duplicated region for block: B:846:0x106a  */
        /* JADX WARN: Removed duplicated region for block: B:847:0x1071  */
        /* JADX WARN: Removed duplicated region for block: B:848:0x1078  */
        /* JADX WARN: Removed duplicated region for block: B:849:0x107f  */
        /* JADX WARN: Removed duplicated region for block: B:850:0x1086  */
        /* JADX WARN: Removed duplicated region for block: B:851:0x108d  */
        /* JADX WARN: Removed duplicated region for block: B:852:0x1094  */
        /* JADX WARN: Removed duplicated region for block: B:853:0x109b  */
        /* JADX WARN: Removed duplicated region for block: B:854:0x10a2  */
        /* JADX WARN: Removed duplicated region for block: B:855:0x10a9  */
        /* JADX WARN: Removed duplicated region for block: B:856:0x10b0  */
        /* JADX WARN: Removed duplicated region for block: B:857:0x10b7  */
        /* JADX WARN: Removed duplicated region for block: B:858:0x10be  */
        /* JADX WARN: Removed duplicated region for block: B:859:0x10c5  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:860:0x10cc  */
        /* JADX WARN: Removed duplicated region for block: B:861:0x10d3  */
        /* JADX WARN: Removed duplicated region for block: B:862:0x10da  */
        /* JADX WARN: Removed duplicated region for block: B:863:0x10e1  */
        /* JADX WARN: Removed duplicated region for block: B:864:0x10e8  */
        /* JADX WARN: Removed duplicated region for block: B:865:0x10ef  */
        /* JADX WARN: Removed duplicated region for block: B:866:0x10f6  */
        /* JADX WARN: Removed duplicated region for block: B:867:0x10fd  */
        /* JADX WARN: Removed duplicated region for block: B:868:0x1104  */
        /* JADX WARN: Removed duplicated region for block: B:869:0x110b  */
        /* JADX WARN: Removed duplicated region for block: B:870:0x1112  */
        /* JADX WARN: Removed duplicated region for block: B:871:0x1119  */
        /* JADX WARN: Removed duplicated region for block: B:872:0x1120  */
        /* JADX WARN: Removed duplicated region for block: B:873:0x1127  */
        /* JADX WARN: Removed duplicated region for block: B:874:0x112e  */
        /* JADX WARN: Removed duplicated region for block: B:875:0x1135  */
        /* JADX WARN: Removed duplicated region for block: B:876:0x113b  */
        /* JADX WARN: Removed duplicated region for block: B:877:0x1141  */
        /* JADX WARN: Removed duplicated region for block: B:878:0x1147  */
        /* JADX WARN: Removed duplicated region for block: B:879:0x114d  */
        /* JADX WARN: Removed duplicated region for block: B:880:0x1153  */
        /* JADX WARN: Removed duplicated region for block: B:881:0x1159  */
        /* JADX WARN: Removed duplicated region for block: B:882:0x115f  */
        /* JADX WARN: Removed duplicated region for block: B:883:0x1165  */
        /* JADX WARN: Removed duplicated region for block: B:884:0x116b  */
        /* JADX WARN: Removed duplicated region for block: B:885:0x1171  */
        /* JADX WARN: Removed duplicated region for block: B:886:0x1177  */
        /* JADX WARN: Removed duplicated region for block: B:887:0x117d  */
        /* JADX WARN: Removed duplicated region for block: B:888:0x1183  */
        /* JADX WARN: Removed duplicated region for block: B:889:0x1189  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:890:0x118f  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Builder(android.content.Context r18) {
            /*
                Method dump skipped, instructions count: 8644
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.Builder.<init>(android.content.Context):void");
        }
    }

    @Deprecated
    public DefaultBandwidthMeter() {
        this(null, ImmutableMap.m11650l(), 2000, Clock.f14615a, false);
    }

    /* renamed from: k */
    public static boolean m7440k(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.m7435c(8);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    /* renamed from: a */
    public /* synthetic */ long mo6741a() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    /* renamed from: b */
    public synchronized void mo7441b(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (m7440k(dataSpec, z)) {
            Assertions.m7516d(this.f14402f > 0);
            long mo7527a = this.f14400d.mo7527a();
            int i2 = (int) (mo7527a - this.f14403g);
            this.f14406j += i2;
            long j2 = this.f14407k;
            long j3 = this.f14404h;
            this.f14407k = j2 + j3;
            if (i2 > 0) {
                this.f14399c.m7481a((int) Math.sqrt(j3), (j3 * 8000.0f) / i2);
                if (this.f14406j >= 2000 || this.f14407k >= 524288) {
                    this.f14408l = (long) this.f14399c.m7482b(0.5f);
                }
                m7446l(i2, this.f14404h, this.f14408l);
                this.f14403g = mo7527a;
                this.f14404h = 0L;
            }
            this.f14402f--;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    /* renamed from: c */
    public synchronized void mo7442c(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (m7440k(dataSpec, z)) {
            if (this.f14402f == 0) {
                this.f14403g = this.f14400d.mo7527a();
            }
            this.f14402f++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    /* renamed from: d */
    public TransferListener mo6742d() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    /* renamed from: e */
    public void mo6743e(BandwidthMeter.EventListener eventListener) {
        this.f14398b.m7426a(eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    /* renamed from: f */
    public synchronized long mo6744f() {
        return this.f14408l;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    /* renamed from: g */
    public synchronized void mo7443g(DataSource dataSource, DataSpec dataSpec, boolean z, int i2) {
        if (m7440k(dataSpec, z)) {
            this.f14404h += i2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    /* renamed from: h */
    public void mo6745h(Handler handler, BandwidthMeter.EventListener eventListener) {
        BandwidthMeter.EventListener.EventDispatcher eventDispatcher = this.f14398b;
        Objects.requireNonNull(eventDispatcher);
        eventDispatcher.m7426a(eventListener);
        eventDispatcher.f14331a.add(new BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener(handler, eventListener));
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    /* renamed from: i */
    public void mo7444i(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    /* renamed from: j */
    public final long m7445j(int i2) {
        Long l2 = this.f14397a.get(Integer.valueOf(i2));
        if (l2 == null) {
            l2 = this.f14397a.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    /* renamed from: l */
    public final void m7446l(final int i2, final long j2, final long j3) {
        if (i2 == 0 && j2 == 0 && j3 == this.f14409m) {
            return;
        }
        this.f14409m = j3;
        Iterator<BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> it = this.f14398b.f14331a.iterator();
        while (it.hasNext()) {
            final BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener next = it.next();
            if (!next.f14334c) {
                next.f14332a.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener = BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener.this;
                        handlerAndListener.f14333b.mo6019k(i2, j2, j3);
                    }
                });
            }
        }
    }

    public DefaultBandwidthMeter(@Nullable Context context, Map<Integer, Long> map, int i2, Clock clock, boolean z) {
        NetworkTypeObserver networkTypeObserver;
        int i3;
        this.f14397a = ImmutableMap.m11649b(map);
        this.f14398b = new BandwidthMeter.EventListener.EventDispatcher();
        this.f14399c = new SlidingPercentile(i2);
        this.f14400d = clock;
        this.f14401e = z;
        if (context != null) {
            synchronized (NetworkTypeObserver.class) {
                if (NetworkTypeObserver.f14687e == null) {
                    NetworkTypeObserver.f14687e = new NetworkTypeObserver(context);
                }
                networkTypeObserver = NetworkTypeObserver.f14687e;
            }
            synchronized (networkTypeObserver.f14690c) {
                i3 = networkTypeObserver.f14691d;
            }
            this.f14405i = i3;
            this.f14408l = m7445j(i3);
            NetworkTypeObserver.Listener listener = new NetworkTypeObserver.Listener() { // from class: com.google.android.exoplayer2.upstream.b
                @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
                /* renamed from: a */
                public final void mo7483a(int i4) {
                    DefaultBandwidthMeter defaultBandwidthMeter = DefaultBandwidthMeter.this;
                    ImmutableList<Long> immutableList = DefaultBandwidthMeter.f14390n;
                    synchronized (defaultBandwidthMeter) {
                        int i5 = defaultBandwidthMeter.f14405i;
                        if (i5 == 0 || defaultBandwidthMeter.f14401e) {
                            if (i5 == i4) {
                                return;
                            }
                            defaultBandwidthMeter.f14405i = i4;
                            if (i4 != 1 && i4 != 0 && i4 != 8) {
                                defaultBandwidthMeter.f14408l = defaultBandwidthMeter.m7445j(i4);
                                long mo7527a = defaultBandwidthMeter.f14400d.mo7527a();
                                defaultBandwidthMeter.m7446l(defaultBandwidthMeter.f14402f > 0 ? (int) (mo7527a - defaultBandwidthMeter.f14403g) : 0, defaultBandwidthMeter.f14404h, defaultBandwidthMeter.f14408l);
                                defaultBandwidthMeter.f14403g = mo7527a;
                                defaultBandwidthMeter.f14404h = 0L;
                                defaultBandwidthMeter.f14407k = 0L;
                                defaultBandwidthMeter.f14406j = 0L;
                                SlidingPercentile slidingPercentile = defaultBandwidthMeter.f14399c;
                                slidingPercentile.f14511b.clear();
                                slidingPercentile.f14513d = -1;
                                slidingPercentile.f14514e = 0;
                                slidingPercentile.f14515f = 0;
                            }
                        }
                    }
                }
            };
            Iterator<WeakReference<NetworkTypeObserver.Listener>> it = networkTypeObserver.f14689b.iterator();
            while (it.hasNext()) {
                WeakReference<NetworkTypeObserver.Listener> next = it.next();
                if (next.get() == null) {
                    networkTypeObserver.f14689b.remove(next);
                }
            }
            networkTypeObserver.f14689b.add(new WeakReference<>(listener));
            networkTypeObserver.f14688a.post(new RunnableC0207a(networkTypeObserver, listener, 8));
            return;
        }
        this.f14405i = 0;
        this.f14408l = m7445j(0);
    }
}
