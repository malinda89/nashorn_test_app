var findMeds = function(illness, age) {
    var meds;

    switch(illness) {
        case 'headache':
            meds = age <= 5 ? 'Lama Panadol' : 'Any kind of paracetamol';
            break;
        case 'stomachache':
            meds = age <= 10 ? 'Gripe Water' : 'Asamodagan';
            break;
        case 'allergy':
            meds = 'Piriton';
            break;
        case 'cold':
            meds = 'Vitamin C';
            break;
        default:
            meds = 'Unknown illness type: ' + illness + ' - Contact SAITM Admin!!!';
    }

    return meds;
}