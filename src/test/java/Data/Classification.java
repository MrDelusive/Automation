package Data;

public enum Classification {

    ACCOUNTING,
    ADMINISTRATIONANDOFFICE,
    ADVERTISINGARTSMEDIA,
    BANKINGANDFINANCIAL,
    CALLCENTRECUSTSERVICE,
    CEOANDGENERALMANAGEMENT,
    COMMUNITYSERVICES,
    CONSTRUCTION,
    CONSULTINGANDSTRATEGY,
    DESIGNANDARCHITECTURE,
    EDUCATIONANDTRAINING,
    ENGINEERING,
    FARMINGANIMALSANDCONSERVATION,
    GOVERNMENTANDDEFENCE,
    HEALTHCAREANDMEDICAL,
    HOSPITALITYANDTOURISM,
    HRANDRECRUITMENT,
    ITANDCT,
    INSURANCEANDSUPER,
    LEGAL,
    MANUFACTURINGTRANSPORTANDLOGISTICS,
    MARKETINGANDCOMMUNICATIONS,
    MININGRESOURCESANDENERGY,
    REALESTATEANDPROPERTY,
    RETAILANDCONSUMERPRODUCTS,
    SALES,
    SCIENCEANDTECH,
    SELFEMPLOYMENT,
    SPORTANDRECREATION,
    TRADESANDSERVICES

    ;


    @Override
    public String toString() {
        switch(this) {
            case ACCOUNTING: return "Accounting";
            case ADMINISTRATIONANDOFFICE: return "Administration & Office Support";
            case ADVERTISINGARTSMEDIA: return "Advertising, Arts & Media";
            case BANKINGANDFINANCIAL: return "Banking & Financial Services";
            case CALLCENTRECUSTSERVICE: return "Call Centre & Customer Service";
            case CEOANDGENERALMANAGEMENT: return "CEO & General Management";
            case COMMUNITYSERVICES: return "Community Services & Development";
            case CONSTRUCTION: return "Construction";
            case CONSULTINGANDSTRATEGY: return "Consulting & Strategy";
            case DESIGNANDARCHITECTURE: return "Design & Architecture";
            case EDUCATIONANDTRAINING: return "Education & Training";
            case ENGINEERING: return "Engineering";
            case FARMINGANIMALSANDCONSERVATION: return "Farming, Animals & Conservation";
            case GOVERNMENTANDDEFENCE: return "Government & Defence";
            case HEALTHCAREANDMEDICAL: return "Healthcare & Medical";
            case HOSPITALITYANDTOURISM: return "Hospitality & Tourism";
            case ITANDCT: return "Information & Communication Technology";
            case INSURANCEANDSUPER: return "Insurance & Superannuation";
            case LEGAL: return "Legal";
            case MANUFACTURINGTRANSPORTANDLOGISTICS: return "Manufacturing, Transport & Logistics";
            case MARKETINGANDCOMMUNICATIONS: return "Marketing & Communications";
            case MININGRESOURCESANDENERGY: return "Mining, Resources & Energy";
            case REALESTATEANDPROPERTY: return "Real Estate & Property";
            case RETAILANDCONSUMERPRODUCTS: return "Retail & Consumer Products";
            case SALES: return "Sales";
            case SCIENCEANDTECH: return "Science & Technology";
            case SELFEMPLOYMENT: return "Self Employment";
            case SPORTANDRECREATION: return "Sport & Recreation";
            case TRADESANDSERVICES: return "Trades & Services";


            default: throw new IllegalArgumentException();
        }
    }
}
