package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
class DisplayNotification {

    /* renamed from: a */
    public final ExecutorService f23255a;

    /* renamed from: b */
    public final Context f23256b;

    /* renamed from: c */
    public final NotificationParams f23257c;

    public DisplayNotification(Context context, NotificationParams notificationParams, ExecutorService executorService) {
        this.f23255a = executorService;
        this.f23256b = context;
        this.f23257c = notificationParams;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(84:20|(83:281|282|23|(1:25)|26|27|28|(1:30)|278|32|(3:254|255|(77:257|(71:259|(1:261)|35|(1:37)|38|(2:40|(1:42))|43|(60:45|(1:238)|49|(1:51)|52|(1:54)(2:228|(1:233)(1:232))|(1:56)|57|(1:59)(5:216|(1:218)|219|(1:221)(1:227)|(1:223)(2:224|(1:226)))|60|(1:62)(8:190|(5:193|(1:206)(1:199)|(3:201|202|203)(1:205)|204|191)|207|208|(1:210)|211|(1:213)(1:215)|214)|63|(1:65)(3:185|(1:187)(1:189)|188)|(1:67)|68|(43:181|182|(1:74)|75|(1:77)|78|(37:80|(1:175)|(1:85)|86|(33:88|(1:173)|(1:93)|94|(29:96|(1:98)|(1:100)|101|(25:168|169|(1:105)|106|(3:158|159|(22:161|(1:163)|164|(1:110)|111|(4:113|114|115|(2:117|(16:119|(1:121)|122|(1:124)|125|(1:127)|128|(1:130)|131|(1:133)|134|(3:141|142|(1:144))|136|(1:138)|139|140)(2:150|151))(2:152|153))|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)(2:165|166))|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|70|(43:177|178|(0)|75|(0)|78|(0)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|72|(0)|75|(0)|78|(0)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|239|(62:248|249|250|(1:247)|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|243|(1:245)|247|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|262|(73:264|(1:266)|35|(0)|38|(0)|43|(0)|239|(1:241)|248|249|250|(0)|247|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)(1:274)|267|(3:269|(1:271)(1:273)|272)|35|(0)|38|(0)|43|(0)|239|(0)|248|249|250|(0)|247|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140))|34|35|(0)|38|(0)|43|(0)|239|(0)|248|249|250|(0)|247|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140)|22|23|(0)|26|27|28|(0)|278|32|(0)|34|35|(0)|38|(0)|43|(0)|239|(0)|248|249|250|(0)|247|49|(0)|52|(0)(0)|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|176|(0)|86|(0)|174|(0)|94|(0)|172|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|157|(0)|122|(0)|125|(0)|128|(0)|131|(0)|134|(0)|136|(0)|139|140) */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0204, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0205, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x00b9, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00ba, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r7 != null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0392 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: NameNotFoundException -> 0x00b9, TRY_LEAVE, TryCatch #2 {NameNotFoundException -> 0x00b9, blocks: (B:28:0x00ae, B:30:0x00b4), top: B:27:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0474  */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m12637a() {
        /*
            Method dump skipped, instructions count: 1659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.DisplayNotification.m12637a():boolean");
    }
}
