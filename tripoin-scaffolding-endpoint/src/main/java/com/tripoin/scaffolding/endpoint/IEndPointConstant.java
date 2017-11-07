package com.tripoin.scaffolding.endpoint;

/**
 * Created on 10/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IEndPointConstant {

    interface Common {
        String BASE_PACKAGES = "com.tripoin.telkomsigma.tmf";
        String AUTHORIZATION = "Authorization";
        String BEARER_PREFIX = "Bearer ";
        String BASIC_PREFIX = "Basic ";
        String REALM_PREFIX = "realm=";
        String REALM_BASIC = BASIC_PREFIX.concat(REALM_PREFIX).concat("\"Authorization/client\"");
        String REALM_BEARER = BEARER_PREFIX.concat(REALM_PREFIX).concat("\"oauth\"");
        String WWW_AUTHANTICATE = "WWW-Authenticate";
        String METHOD_POST = "POST";
        String CLIENT_IDENTIFIER = "client_id";
        String CLIENT_SECRET = "client_secret";
        String HTTP_REQUEST = "HTTP.REQUEST";
        String ACCESS_TOKEN = "access_token";

        String DATE_FORMAT = "dd-MM-yyyy";
        String DATE_TIME_FORMAT = "dd-MM-yyyy";
        String PUBLIC_USER = "Public User";

        String APPLICATION_JSON = "application/json";
        String APPLICATION_XML = "application/xml";

        interface GeneralValue{
            int ONE = 1;
            int ZERO = 0;
            int MIN_ONE = -1;

            String OK = "OK";
            String KEY = "Key";
            String VALUE = "Value";
        }

        interface Punctuation {
            String SPACE = " ";
            String COLON = ":";
            String SEMI_COLON = ";";
            String COMMA = ",";
            String QUESTION = "?";
            String UNDERSCORE = "_";
            String HYPHEN = "-";
            String SLASH = "/";
            String AT_MARK = "@";
            String EMPTY = "";
            String PERCENTAGE = "%";
        }
    }

    interface PathName {
        String PATH_OAUTH_TOKEN = "/oauth/token";
        String PATH_PROFILE = "/profile";
        String PATH_CHANGE = "/100005";
        String PATH_LOGOUT = "/100002";
        String PATH_LOCALE = "/locale";
        String PARAM_API_TYPE_CODE = "apiTypeCode";
        String PATH_API_TYPE_CODE = "{" + PARAM_API_TYPE_CODE + "}";
        String PATH_AUTH = "/100001";
        String PATH_REFRESH = "/100004";
        String PATH_ADMIN_MENU_GENERATOR = "/100003";
        String PATH_ECHO = "/echo";
        String PATH_START_JMS_MANAGER = "/jms/manager/start";
        String PATH_STOP_JMS_MANAGER = "/jms/manager/stop";

        interface PathScaffolding {
            String PATH_FIND_ALL = "/100004";
            String PATH_FIND_ALL_PAGINATION = "/100005";

            String PATH_FIND_BY_ID = "/100006";

            String PATH_FIND_BY_CODE = "/100007";
            String PATH_FIND_BY_CODE_ORDER_BY_ID_ASC = "/100008";
            String PATH_FIND_BY_CODE_ORDER_BY_CODE_ASC = "/100009";
            String PATH_FIND_BY_CODE_ORDER_BY_CODE_DESC = "/100010";
            String PATH_FIND_PAGINATION_BY_CODE_ORDER_BY_CODE = "/100011";
            String PATH_FIND_PAGINATION_BY_CODE_ORDER_BY_ID = "/100031";

            String PATH_FIND_BY_NAME = "/100012";
            String PATH_FIND_BY_NAME_ORDER_BY_ID_ASC = "/100013";
            String PATH_FIND_BY_CODE_ORDER_BY_NAME_ASC = "/100014";
            String PATH_FIND_BY_CODE_ORDER_BY_NAME_DESC = "/100015";
            String PATH_FIND_PAGINATION_BY_NAME_ORDER_BY_NAME = "/100016";
            String PATH_FIND_PAGINATION_BY_NAME_ORDER_BY_ID = "/100032";
            String PATH_SELECT_LOV = "/100017";

            String PATH_APPROVE_ALL = "/100018";
            String PATH_APPROVE_SINGLE_DATA = "/100019";
            String PATH_CANCEL_ALL = "/100020";
            String PATH_CANCEL_SINGLE_DATA = "/100021";
            String PATH_UPDATE = "100022";
            String PATH_INSERT = "100023";
            String PATH_INSERT_AND_FLUSH = "100024";
            String PATH_INSERT_COLLECTION = "100025";

            String PATH_DELETE = "100026";
            String PATH_DELETE_BY_ENTITY = "100027";
            String PATH_DELETE_COLLECTION = "100028";
            String PATH_DELETE_COLLECTION_BY_ID = "100029";

            String PATH_ADVANCED_PAGINATION = "100030";
        }

        interface Security {
            String PATH_COMPANY = "/api/security/190001";
            String PATH_BRANCH = "/api/security/190002";
            String PATH_ROLE = "/api/security/190003";
            String PATH_GROUP = "/api/security/190006";
            String PATH_FUNCTION = "/api/security/190004";
            String PATH_FUNCTION_ASSIGNMENT = "/api/security/190005";
            String PATH_PROFILE = "/api/security/190010";
            String PATH_PASSWORD = "/api/security/password";
            String PATH_GET_PROFILE = "/191001";
            String PATH_UPDATE_PROFILE = "/191002";
            String PATH_UPDATE_PASSWORD = "/191003";
            String PATH_FORGOT_PASSWORD = "/191004";
            String PATH_RESET_PASSWORD = "/191005";
            String PATH_REGISTRATION = "/api/security/200001";
            String PATH_REGISTRATION_MEMBER = "200002";
            String PATH_ACTIVATE_MEMBER = "200003";
        }
    }
}
