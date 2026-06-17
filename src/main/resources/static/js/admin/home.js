document.addEventListener("DOMContentLoaded", () => {

    const form = document.getElementById("searchForm");

    form.addEventListener("submit", (e) => {

        e.preventDefault();

        const phoneNumber =
            document.getElementById("phoneNumber")
                .value
                .trim();

        if (!phoneNumber) {

            alert("전화번호를 입력해주세요.");
            return;
        }

        window.location.href =
            `/admin/participants/search?phoneNumber=${phoneNumber}`;

    });

});