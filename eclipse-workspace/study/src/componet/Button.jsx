import styled from "styled-components";

const ButtonTag = styled.button`
    padding:20px 18px;background:#fafafa;border:none;border-radius:12px;box-shadow: 1.5px 1px 2px rgba(0,0,0,0.3);
  font-size:1vw;font-weight: bold;
`;

function Button(props){
    return(
        <>
            <ButtonTag type="button">{props.text ? props.text : 'text 를지정하세요.'}</ButtonTag>
        </>
    )
}
export default Button;