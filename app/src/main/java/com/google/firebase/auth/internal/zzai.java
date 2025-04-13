package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.gms.common.api.Status;
import com.yandex.mobile.ads.C4632R;
import java.util.Arrays;
import java.util.List;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzai {
    @NonNull
    /* renamed from: a */
    public static Status m12298a(@Nullable String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        return asList.size() > 1 ? m12299b((String) asList.get(0), (String) asList.get(1)) : m12299b((String) asList.get(0), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NonNull
    /* renamed from: b */
    public static Status m12299b(String str, @Nullable String str2) {
        char c2;
        int i2;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    c2 = 'C';
                    break;
                }
                c2 = 65535;
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    c2 = JsonPointer.SEPARATOR;
                    break;
                }
                c2 = 65535;
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    c2 = '@';
                    break;
                }
                c2 = 65535;
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    c2 = '-';
                    break;
                }
                c2 = 65535;
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    c2 = '\'';
                    break;
                }
                c2 = 65535;
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    c2 = ')';
                    break;
                }
                c2 = 65535;
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    c2 = JsonFactory.DEFAULT_QUOTE_CHAR;
                    break;
                }
                c2 = 65535;
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    c2 = '2';
                    break;
                }
                c2 = 65535;
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    c2 = '$';
                    break;
                }
                c2 = 65535;
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    c2 = '<';
                    break;
                }
                c2 = 65535;
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    c2 = ':';
                    break;
                }
                c2 = 65535;
                break;
            case -974503964:
                if (str.equals("MISSING_OR_INVALID_NONCE")) {
                    c2 = 'B';
                    break;
                }
                c2 = 65535;
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    c2 = '(';
                    break;
                }
                c2 = 65535;
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    c2 = '9';
                    break;
                }
                c2 = 65535;
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    c2 = '*';
                    break;
                }
                c2 = 65535;
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    c2 = '=';
                    break;
                }
                c2 = 65535;
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    c2 = '7';
                    break;
                }
                c2 = 65535;
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    c2 = '>';
                    break;
                }
                c2 = 65535;
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    c2 = '3';
                    break;
                }
                c2 = 65535;
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    c2 = '6';
                    break;
                }
                c2 = 65535;
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    c2 = 'D';
                    break;
                }
                c2 = 65535;
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    c2 = '+';
                    break;
                }
                c2 = 65535;
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    c2 = ';';
                    break;
                }
                c2 = 65535;
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    c2 = '4';
                    break;
                }
                c2 = 65535;
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    c2 = '8';
                    break;
                }
                c2 = 65535;
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    c2 = '%';
                    break;
                }
                c2 = 65535;
                break;
            case 799258561:
                if (str.equals("INVALID_PROVIDER_ID")) {
                    c2 = '.';
                    break;
                }
                c2 = 65535;
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    c2 = '0';
                    break;
                }
                c2 = 65535;
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    c2 = '5';
                    break;
                }
                c2 = 65535;
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    c2 = 'A';
                    break;
                }
                c2 = 65535;
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    c2 = '&';
                    break;
                }
                c2 = 65535;
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    c2 = '!';
                    break;
                }
                c2 = 65535;
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    c2 = ' ';
                    break;
                }
                c2 = 65535;
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    c2 = ',';
                    break;
                }
                c2 = 65535;
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    c2 = '#';
                    break;
                }
                c2 = 65535;
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    c2 = '?';
                    break;
                }
                c2 = 65535;
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    c2 = '1';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                i2 = 17016;
                break;
            case 1:
                i2 = 17002;
                break;
            case 2:
                i2 = 17000;
                break;
            case 3:
            case 4:
                i2 = 17004;
                break;
            case 5:
                i2 = 17005;
                break;
            case 6:
            case 7:
                i2 = 17008;
                break;
            case '\b':
            case '\t':
                i2 = 17011;
                break;
            case '\n':
                i2 = 17007;
                break;
            case 11:
                i2 = 17009;
                break;
            case '\f':
                i2 = 17025;
                break;
            case '\r':
                i2 = 17017;
                break;
            case 14:
            case 15:
                i2 = 17020;
                break;
            case 16:
                i2 = 17026;
                break;
            case 17:
            case 18:
                i2 = 17006;
                break;
            case 19:
                i2 = 17028;
                break;
            case 20:
                i2 = 17014;
                break;
            case 21:
            case 22:
                i2 = 17010;
                break;
            case 23:
                i2 = 17021;
                break;
            case 24:
                i2 = 17030;
                break;
            case 25:
                i2 = 17029;
                break;
            case 26:
                i2 = 17031;
                break;
            case 27:
                i2 = 17032;
                break;
            case 28:
                i2 = 17033;
                break;
            case 29:
                i2 = 17034;
                break;
            case 30:
                i2 = 17035;
                break;
            case 31:
                i2 = 17041;
                break;
            case ' ':
                i2 = 17042;
                break;
            case '!':
                i2 = 17043;
                break;
            case '\"':
                i2 = 17044;
                break;
            case '#':
                i2 = 17045;
                break;
            case '$':
                i2 = 17046;
                break;
            case '%':
                i2 = 17049;
                break;
            case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                i2 = 17051;
                break;
            case '\'':
                i2 = 17052;
                break;
            case '(':
                i2 = 17064;
                break;
            case ')':
                i2 = 17061;
                break;
            case '*':
                i2 = 17062;
                break;
            case '+':
                i2 = 17065;
                break;
            case ',':
                i2 = 17040;
                break;
            case '-':
                i2 = 17068;
                break;
            case '.':
                i2 = 17071;
                break;
            case '/':
                i2 = 17057;
                break;
            case '0':
                i2 = 17058;
                break;
            case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                i2 = 17073;
                break;
            case '2':
                i2 = 17079;
                break;
            case '3':
                i2 = 17074;
                break;
            case '4':
                i2 = 17075;
                break;
            case '5':
                i2 = 17078;
                break;
            case '6':
                i2 = 17081;
                break;
            case '7':
                i2 = 17082;
                break;
            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                i2 = 17083;
                break;
            case '9':
                i2 = 17084;
                break;
            case ':':
                i2 = 17085;
                break;
            case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                i2 = 17086;
                break;
            case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                i2 = 17087;
                break;
            case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                i2 = 17088;
                break;
            case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                i2 = 17089;
                break;
            case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                i2 = 17090;
                break;
            case '@':
                i2 = 17091;
                break;
            case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                i2 = 17093;
                break;
            case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                i2 = 17094;
                break;
            case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                i2 = 18001;
                break;
            case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                i2 = 17095;
                break;
            default:
                i2 = 17499;
                break;
        }
        return i2 == 17499 ? str2 != null ? new Status(17499, C0000a.m16m(str, ":", str2)) : new Status(17499, str) : new Status(i2, str2);
    }
}
