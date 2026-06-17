const form = document.getElementById('registrationForm');

form.addEventListener('submit', function (e) {

    const values = Array.from(
        document.querySelectorAll('.lecture-select')
    ).map(select => select.value);

    if (new Set(values).size !== values.length) {

        e.preventDefault();

        alert('동일한 특강은 중복 선택할 수 없습니다.');

        return;
    }

    const button =
        document.getElementById('submitButton');

    button.disabled = true;

    button.innerHTML =
        '<span class="spinner-border spinner-border-sm me-2"></span>신청 중...';

});